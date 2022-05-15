package concurrent.aqs;

/**
 * @author happy
 * @since 2022/5/15
 */
public class MyLockClient {
    public static void main(String[] args) {
        MyLock myLock = new MyLock();
        new Thread(() -> {
            myLock.lock();
            try {
                System.out.println("t1 locking...");
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } finally {
                System.out.println("t1 unlocking");
                myLock.unlock();
            }

        }, "t1").start();

        new Thread(() -> {
            myLock.lock();
            try {
                System.out.println("t2 locking...");
            } finally {
                System.out.println("t2 unlinking ...");
                myLock.unlock();
            }

        }, "t2").start();

    }
}
