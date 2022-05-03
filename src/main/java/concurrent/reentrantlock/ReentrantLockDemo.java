package concurrent.reentrantlock;

import java.util.concurrent.locks.ReentrantLock;

/**
 * 可重入锁
 * @author happy
 * @since 2022/5/3
 */
public class ReentrantLockDemo {
    private static ReentrantLock lock = new ReentrantLock();

    public static void main(String[] args) {

        lock.lock();
        try {
            System.out.println("enter main");
            method1();
        } finally {
            lock.unlock();
        }
    }

    public static void method1() {
        lock.lock();

        try {
            System.out.println("enter m1");
            method2();
        } finally {
            lock.unlock();
        }
    }

    public static void method2() {
        lock.lock();

        try {
            System.out.println("enter m2");
        } finally {
            lock.unlock();
        }
    }

}
