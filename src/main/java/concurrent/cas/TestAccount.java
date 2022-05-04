package concurrent.cas;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author happy
 * @since 2022/5/4
 */
public class TestAccount {
    public static void main(String[] args) {
        AtomicInteger atomicInteger = new AtomicInteger();
        atomicInteger.compareAndSet(100,10);
    }
}
