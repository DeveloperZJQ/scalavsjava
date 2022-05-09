package concurrent.threadpool;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author DeveloperZJQ
 * @since 2022-5-5
 */
public class TestThreadPool {
    public static void main(String[] args) {
        MyThreadPool myThreadPool = new MyThreadPool(5, 1000, TimeUnit.MILLISECONDS, 10);
        for (int i = 0; i < 5; i++) {
            int j = i;
            myThreadPool.execute(() -> System.out.println("{}" + j));
        }
    }
}

@FunctionalInterface
interface RejectPolicy<T> {
    void reject(BlockingQueue<T> queue, Runnable task);
}

class MyThreadPool {
    //任务队列
    private final BlockingQueue<Runnable> taskQueue;
    //线程集合
    private final HashSet<Worker> workers = new HashSet<>();
    //线程核心数量
    private final int coreSize;
    //获取任务的超时时间
    private long timeout;
    //获取超时时间单位
    private TimeUnit timeUnit;

    public void execute(Runnable task) {
        //当任务数没有超过coreSize时,直接交给worker对象执行
        //如果任务数超过coreSize时,加入任务队列暂存
        synchronized (workers) {
            if (workers.size() < coreSize) {
                Worker worker = new Worker(task);
                System.out.println("新增worker：" + worker + "task:" + task);
                workers.add(worker);
                worker.start();
            } else {
                System.out.println("加入队列:" + task);
                taskQueue.put(task);
                // 死等
                // 带超时等待
                // 让调用者放弃任务执行
                // 让调用者抛出异常
                // 让调用者自己执行任务
            }
        }
    }

    public MyThreadPool(int coreSize, long timeout, TimeUnit timeUnit, int queueCapacity) {
        this.coreSize = coreSize;
        this.timeout = timeout;
        this.timeUnit = timeUnit;
        this.taskQueue = new BlockingQueue<>(queueCapacity);
    }

    class Worker extends Thread {
        private Runnable task;

        public Worker(Runnable task) {
            this.task = task;
        }

        @Override
        public void run() {
            //执行任务
            //当task不为空,执行任务
            //当task执行完毕,再接着从任务队列获取任务并执行
            while (task != null || (task = taskQueue.take()) != null) {
                try {
                    System.out.println("正在执行..." + task);
                    task.run();
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    task = null;
                }
            }

            synchronized (workers) {
                System.out.println("worker被移除：" + task);
                workers.remove(this);
            }
        }
    }
}

class BlockingQueue<T> {
    // 任务队列
    private final Deque<T> queue = new ArrayDeque<>();

    //lock
    private final ReentrantLock lock = new ReentrantLock();

    //生产者环境变量
    private final Condition fullWaitSet = lock.newCondition();
    //消费者环境变量
    private final Condition emptyWaitSet = lock.newCondition();

    //initCapacity
    private final int capacity;

    public BlockingQueue(int capacity) {
        this.capacity = capacity;
    }

    //超时阻塞获取
    public T poll(long timeout, TimeUnit unit) {
        lock.lock();
        try {
            //将超时时间转换成纳秒
            long nanos = unit.toNanos(timeout);
            while (queue.isEmpty()) {
                try {
                    //返回的是剩余时间
                    if (nanos <= 0) {
                        return null;
                    }
                    nanos = emptyWaitSet.awaitNanos(nanos);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            return queue.removeFirst();
        } finally {
            lock.unlock();
        }
    }

    //阻塞获取
    public T take() {
        lock.lock();
        try {
            while (queue.isEmpty()) {
                try {
                    emptyWaitSet.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            fullWaitSet.signal();
            return queue.removeFirst();
        } finally {
            lock.unlock();
        }
    }

    public void put(T element) {
        lock.lock();
        try {
            while (queue.size() == capacity) {
                try {
                    fullWaitSet.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            queue.addLast(element);
            emptyWaitSet.signal();
        } finally {
            lock.unlock();
        }
    }

    public boolean offer(T task, long timeout, TimeUnit timeUnit) {
        lock.lock();
        try {
            long nanos = timeUnit.toNanos(timeout);
            while (queue.size() == capacity) {
                try {
                    System.out.println("等待加入任务队列：" + task);
                    if (nanos <= 0) {
                        return false;
                    }
                    nanos = fullWaitSet.awaitNanos(nanos);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("加入任务队列：" + task);
            queue.addLast(task);
            emptyWaitSet.signal();
            return true;
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
}