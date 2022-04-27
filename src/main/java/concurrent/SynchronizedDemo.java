package concurrent;

/**
 * 1. synchronized 对相同对象都上锁，才能起到锁的作用
 * 2. synchronized 只有一个对象上锁，不能起到锁的作用
 *
 * @author DeveloperZJQ
 * @since 2022-4-27
 */
public class SynchronizedDemo {
    static int count = 0;

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 50000; i++) {
                synchronized (SynchronizedDemo.class) {
                    System.out.println("t1-->" + count);
                    ++count;
                }
            }
        }, "t1");

        t1.start();
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 50000; i++) {
                synchronized (SynchronizedDemo.class) {
                    System.out.println("t2-->" + count);
                    --count;
                }
            }
        }, "t2");
        t2.start();

        Thread.sleep(5000);
        System.out.println(count);
    }
}