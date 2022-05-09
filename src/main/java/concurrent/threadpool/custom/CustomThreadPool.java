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

    public CustomThreadPool(int coreSize, int capacity) {
        this.tasks = new BlockingQueue<>(capacity);
        this.coreSize = coreSize;
    }

    public void execute(Runnable task) {
        synchronized (workers) {
            if (workers.size() < coreSize) {
                Worker worker = new Worker(task);
                worker.start();
                workers.add(worker);
            } else {
                tasks.put(task);
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
