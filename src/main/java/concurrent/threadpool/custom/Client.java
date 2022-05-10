package concurrent.threadpool.custom;

/**
 * @author DeveloperZJQ
 * @since 2022-5-9
 */
public class Client {
    public static void main(String[] args) {
//        CustomThreadPool customThreadPool = new CustomThreadPool(1, 1);
        //加入拒绝策略
        CustomThreadPool customThreadPool = new CustomThreadPool(1, 1,
                (queue, task) ->{
                    //1. 死等策略
//                queue.put(task)
                    //2. 超时策略
//                    queue.offer(task,1500, TimeUnit.MILLISECONDS);
                    //3. 让调用者放弃task任务

                    //4. 任务执行失败
//                    throw new RuntimeException("task执行失败："+task);
                    //5. 让调用者自己执行任务
                    task.run();
                }
        );
        for (int i = 0; i < 3; i++) {
            int j = i;
            customThreadPool.execute(() -> {
                System.out.println("{}:" + j);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }
    }
}
