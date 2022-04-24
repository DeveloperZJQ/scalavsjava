package concurrent;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @author happy
 * @since 2022/4/23
 */
public class MyExecutor {
    private static final int taskSize = 3;

    void ExecutorServer() {
        //创建一个线程池
        ExecutorService pool = Executors.newFixedThreadPool(taskSize);

    }
}
