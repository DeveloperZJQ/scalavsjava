package concurrent.threadpool.custom;

import java.util.HashSet;
import java.util.concurrent.TimeUnit;

/**
 * @author DeveloperZJQ
 * @since 2022-5-9
 */
public class CustomThreadPool {
    private final int coreSize;
    private final BlockingQueue<Runnable> tasks;
    private final HashSet<Worker> workers = new HashSet<>();
    private final RejectPolicy<Runnable> rejectPolicy;

    public CustomThreadPool(int coreSize, int capacity, RejectPolicy<Runnable> rejectPolicy) {
        this.tasks = new BlockingQueue<>(capacity);
        this.coreSize = coreSize;
        this.rejectPolicy = rejectPolicy;
    }

    public void execute(Runnable task) {
        synchronized (workers) {
            if (workers.size() < coreSize) {
                Worker worker = new Worker(task);
                workers.add(worker);
                worker.start();
            } else {
                //1. 死等
//                tasks.put(task);
                //2. 带超时的等待
                // tasks.offer(task,10,TimeUnit.SECONDS);
                //3. 放弃任务执行
                //4. 让调用者抛出异常
                //5. 让调用者自己执行任务
                tasks.tryPut(rejectPolicy, task);
            }
        }
    }

    class Worker extends Thread {
        private Runnable task;

        public Worker(Runnable task) {
            this.task = task;
        }

        @Override
        public void run() {
//            while (task != null || (task = tasks.take()) != null) {
                // poll 超时worker被移除
            while (task != null || (task = tasks.poll(1, TimeUnit.SECONDS)) != null) {
                try {
                    task.run();
                } finally {
                    task = null;
                }
            }

            synchronized (workers) {
                System.out.println("remove：" + this);
                workers.remove(this);
            }
        }
    }
}

//拒绝策略
@FunctionalInterface
interface RejectPolicy<T> {
    void reject(BlockingQueue<T> queue, T task);
}