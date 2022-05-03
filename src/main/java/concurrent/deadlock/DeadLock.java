package concurrent.deadlock;

/**
 * @author happy
 * @since 2022/5/2
 */
public class DeadLock {

    public static void main(String[] args) {
        Object o1 = new Object();
        Object o2 = new Object();

        Thread t1 = new Thread(() -> {
            synchronized (o1) {
                System.out.println("lock o1");
                try {
                    Thread.sleep(1000);
                    synchronized (o2) {
                        System.out.println("lock B");
                        System.out.println("操作...");
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "t1");

        Thread t2 = new Thread(() -> {
            synchronized (o2) {
                System.out.println("lock o2");
                try {
                    Thread.sleep(500);
                    synchronized (o1) {
                        System.out.println("lock o1");
                        System.out.println("操作");
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "t2");

        t1.start();
        t2.start();
    }
}
