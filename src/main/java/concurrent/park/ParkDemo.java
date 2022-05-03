package concurrent.park;

import java.util.concurrent.locks.LockSupport;

/**
 * @author happy
 * @since 2022/5/2
 */
public class ParkDemo {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            System.out.println("start...");
            try {
                Thread.sleep(2000);
                System.out.println("park...");
                LockSupport.park();
                System.out.println("resume...");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("unPark...");
        LockSupport.unpark(t1);
    }
}
