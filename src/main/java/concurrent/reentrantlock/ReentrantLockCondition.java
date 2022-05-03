package concurrent.reentrantlock;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author happy
 * @since 2022/5/3
 */
public class ReentrantLockCondition {
    static ReentrantLock lock = new ReentrantLock();

    public static void main(String[] args) {

        Condition condition1 = lock.newCondition();
        Condition condition2 = lock.newCondition();

        lock.lock();

        try {
            condition1.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
            lock.unlock();
        }

    }
}
