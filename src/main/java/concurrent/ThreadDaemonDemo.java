package concurrent;

/**
 * @author DeveloperZJQ
 * @since 2022-4-26
 */
public class ThreadDaemonDemo {
    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(() -> {
            while (true) {
                Thread thread = Thread.currentThread();
                if (thread.isInterrupted()) {
                    break;
                }
            }
        });

        //守护线程，该配置项开启，表示开启线程守护，设置false就代表不是守护线程，就一会一直阻塞
        thread1.setDaemon(true);
        thread1.start();
        Thread.sleep(3000);
        System.out.println("main function end.");
    }
}