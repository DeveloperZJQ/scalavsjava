package concurrent.volatiledemo;

/**
 * @author happy
 * @since 2022/5/4
 */
public class volatileDemo1 {
    static boolean run = false;

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            while (!run) {
                System.out.println("loop...");
            }
        }, "t1");

        t1.start();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        run = true;
        System.out.println("停止");
    }
}
