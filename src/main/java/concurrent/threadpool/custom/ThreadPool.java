package concurrent.threadpool.custom;

import java.util.HashSet;

/**
 * @author happy
 * @since 2022/5/9
 */
public class ThreadPool {
    //任务task队列
    //工作线程worker队列
    //工作线程最大容量
    private final BlockingQueue<Runnable> queue;
    private final HashSet<Worker> workers = new HashSet<>();
    private int capacity;
    private int coreSize;

    public ThreadPool(int capacity, int coreSize) {
        this.coreSize = coreSize;
        this.capacity = capacity;
        this.queue = new BlockingQueue<>(capacity);
    }

    public void execute(Runnable task) {
        synchronized (workers){
            //队列未满
            if (workers.size() < coreSize) {
                Worker worker = new Worker(task);
                workers.add(worker);
                worker.start();
            } else {
                queue.put(task);
            }
            //队列已满
        }
    }

    class Worker extends Thread {
        private Runnable task;

        @Override
        public void run() {
            while (task != null || (task = queue.take()) != null) {
                try {
                    task.run();
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    task = null;
                }

            }

            synchronized (workers) {
                workers.remove(this);
            }
        }

        public Worker(Runnable task) {
            this.task = task;
        }
    }
}
