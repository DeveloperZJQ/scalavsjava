package concurrent.reentrantlock;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author happy
 * @since 2022/5/3
 */
public class ReentrantLockDemo2 {
    private static ReentrantLock lock = new ReentrantLock();

    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread(() -> {
            try {
                //如果没有竞争那么此方法就会获取lock对象锁
                // 如果有竞争就会进入阻塞队列，可以被其他线程用interrupt方法打断
                System.out.println("尝试获取锁");
                lock.lockInterruptibly();
            } catch (InterruptedException e) {
                System.out.println("没有获取,返回");
                e.printStackTrace();
                return;
            }

            try {
                System.out.println("获取锁");

            } finally {
                lock.unlock();
            }
        }, "t1");

        lock.lock();
        t1.start();

        Thread.sleep(1000);
        System.out.println("打断 t1");
        t1.interrupt();
    }
}
