package concurrent.threadpool;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.TimeUnit;

/**
 * @author happy
 * @since 2022/5/11
 */
public class ThreadPoolExecutor {
    public static void main(String[] args) {
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor = new java.util.concurrent.ThreadPoolExecutor(2, 3, 1, TimeUnit.SECONDS, new ArrayBlockingQueue<>(1));
        threadPoolExecutor.execute(()->{
            System.out.println("1111");
            try {
                Thread.sleep(100000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        threadPoolExecutor.execute(()->{
            System.out.println("2222");
            try {
                Thread.sleep(100000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        threadPoolExecutor.execute(()->{
            System.out.println("3333");
            try {
                Thread.sleep(100000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        threadPoolExecutor.execute(()->{
            System.out.println("4444");
            try {
                Thread.sleep(100000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
    }
}
