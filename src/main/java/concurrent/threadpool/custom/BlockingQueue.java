package concurrent.threadpool.custom;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author DeveloperZJQ
 * @since 2022-5-9
 */
public class BlockingQueue<T> {
    private final int capacity;
    private final Deque<T> queue = new ArrayDeque<>();
    private final ReentrantLock lock = new ReentrantLock();
    private final Condition producer = lock.newCondition();
    private final Condition consumer = lock.newCondition();

    public BlockingQueue(int capacity) {
        this.capacity = capacity;
    }

    public void put(T task) {
        lock.lock();
        try {
            while (queue.size() == capacity) {
                try {
                    System.out.println("等待加入任务队列..." + task);
                    producer.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("加入任务队列:" + task);
            queue.add(task);
            consumer.signal();
        } finally {
            lock.unlock();
        }
    }


    public boolean offer(T task, int timeout, TimeUnit timeUnit) {
        lock.lock();
        try {
            long nanos = timeUnit.toNanos(timeout);
            while (queue.size() == capacity) {
                try {
                    System.out.println("等待加入任务队列..." + task);
                    if (nanos <= 0) {
                        return false;
                    }
                    nanos = producer.awaitNanos(nanos);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("加入任务队列:" + task);
            queue.add(task);
            consumer.signal();
            return true;
        } finally {
            lock.unlock();
        }
    }

    public T take() {
        lock.lock();
        try {
            while (queue.isEmpty()) {
                try {
                    consumer.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            producer.signal();
            return queue.removeFirst();
        } finally {
            lock.unlock();
        }
    }

    public T poll(int timeout, TimeUnit timeUnit) {
        lock.lock();
        try {
            long nanos = timeUnit.toNanos(timeout);
            while (queue.isEmpty()) {
                try {
                    // 超时返回null
                    if (nanos < 0) {
                        return null;
                    }
                    nanos = consumer.awaitNanos(nanos);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            producer.signal();
            return queue.removeFirst();
        } finally {
            lock.unlock();
        }
    }

    public int size() {
        lock.lock();
        try {
            return queue.size();
        } finally {
            lock.unlock();
        }
    }

    public void tryPut(RejectPolicy<T> rejectPolicy, T task) {
        lock.lock();
        try {
            // 判断队列是否已经满了
            if (queue.size() == capacity) {
                rejectPolicy.reject(this, task);
            } else {
                System.out.println("加入任务队列：" + task);
                queue.addLast(task);
                consumer.signal();
            }
        } finally {
            lock.unlock();
        }
    }
}
