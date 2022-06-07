package concurrent.threadpool;

/**
 * @author DeveloperZJQ
 * @since 2022-6-7
 */
public class MainChildThread {
    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            try {
                Thread.sleep(20000);
                System.out.println("1");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        },"t1");

        Thread thread2 = new Thread(() -> {
            try {
                Thread.sleep(5000);
                System.out.println("2");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        },"t2");

        thread1.start();
        thread2.start();

        System.out.println("123");
    }
}