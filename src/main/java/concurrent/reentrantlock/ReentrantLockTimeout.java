package concurrent.reentrantlock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author happy
 * @since 2022/5/3
 */
public class ReentrantLockTimeout {
    private static ReentrantLock lock = new ReentrantLock();

    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread(() -> {
            //if success,
            System.out.println("尝试获取锁");
            try {
                if (!lock.tryLock(2, TimeUnit.SECONDS)) {
                    System.out.println("获取不到锁");
                    return;
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
                return;
            }

            try {
                System.out.println("获取到锁了");
            } finally {
                lock.unlock();
            }
        }, "t1");

        lock.lock();
        System.out.println("主线程获取到锁");
        t1.start();
        Thread.sleep(1000);
        lock.unlock();
        System.out.println("主线程释放锁");
    }
}
