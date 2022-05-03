package concurrent.volatiledemo;

/**
 * @author happy
 * @since 2022/5/4
 */
public class VolatileDemo2 {
    volatile static boolean run = true;

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            while (run) {
//                System.out.println("loop");
            }
        }, "t1");

        t1.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        run = false;
        System.out.println("stop");
    }
}
