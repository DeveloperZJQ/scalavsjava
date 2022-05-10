package concurrent.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author happy
 * @since 2022/5/11
 */
public class ThreadFixedPoolExecutorTest {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        executorService.execute(()->{
            System.out.println("111");
        });
    }
}
