package concurrent.threadpool;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author DeveloperZJQ
 * @since 2022-5-5
 */
public class MyThreadPool<T> {
    //1. 任务队列
    private Deque<T> queue = new ArrayDeque<>();

    //2. 锁
    private ReentrantLock lock = new ReentrantLock();

    //3. 生产者条件变量
    private Condition fullWaitSet = lock.newCondition();

    //4. 消费者条件变量

}
