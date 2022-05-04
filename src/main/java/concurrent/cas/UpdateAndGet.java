package concurrent.cas;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicStampedReference;
import java.util.function.IntUnaryOperator;

/**
 * @author happy
 * @since 2022/5/4
 */
public class UpdateAndGet {
    public static void main(String[] args) {
        AtomicInteger i = new AtomicInteger(0);

        //自定义实现AtomicInteger的updateAndGet方法
        updateAndGet(i, operator -> operator + 10);

        System.out.println(i.get());
    }

    /**
     * @param i        传入参数
     * @param operator 传入一元操作
     */
    public static void updateAndGet(AtomicInteger i, IntUnaryOperator operator) {
        while (true) {
            int prev = i.get();
            int next = operator.applyAsInt(prev);
            if (i.compareAndSet(prev, next)) {
                break;
            }
        }
    }
}
