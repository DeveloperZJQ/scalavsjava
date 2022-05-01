package concurrent;

/**
 * @author happy
 * @since 2022/4/27
 */
public class ThreadSixStatus {
    public static void main(String[] args) {
        Thread t0 = new Thread(() -> {
            System.out.println("init");
        }, "t0");

        Thread t1 = new Thread(() -> {
            System.out.println("123");
        }, "t1");

        t1.start();

        Thread t2 = new Thread(() -> {
            while (true) {

            }
        }, "t2");

        t2.start();

        Thread t3 = new Thread(() -> {
            try {
                Thread.sleep(1000000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }, "t3");

        t3.start();
        Thread t4 = new Thread(() -> {
            synchronized (ThreadSixStatus.class) {
                System.out.println("this is lock");
                try {
                    t3.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "t4");

        t4.start();
        Thread t5 = new Thread(() -> {
            synchronized (ThreadSixStatus.class) {
                System.out.println("this is block");
            }
        }, "t5");

        t5.start();
        System.out.println("t0-->" + t0.getState());
        System.out.println("t1-->" + t1.getState());
        System.out.println("t2-->" + t2.getState());
        System.out.println("t3-->" + t3.getState());
        System.out.println("t4-->" + t4.getState());
        System.out.println("t5-->" + t5.getState());
    }
}