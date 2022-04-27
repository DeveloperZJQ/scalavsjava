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

        Room room = new Room();
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 50000; i++) {
                room.increment();
            }
        }, "t1");

        t1.start();
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 50000; i++) {
                room.decrement();
            }
        }, "t2");
        t2.start();

        Thread.sleep(5000);
        System.out.println(room.getCount());
    }
}

class Room {
    private int count;

    public synchronized void increment() {
        count++;
    }

    public synchronized void decrement() {
        count--;
    }

    public synchronized int getCount() {
        return count;
    }
}