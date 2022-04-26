package concurrent;

/**
 * @author happy
 * @since 2022/4/23
 */
public class ThreadDemo extends Thread {
    @Override
    public void run() {
        System.out.println("myThread.run()-->");
    }

}