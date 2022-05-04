package concurrent.volatiledemo;

/**
 * @author happy
 * @since 2022/5/4
 */
public class HappensBefore1 {
    static int x;
    static Object m = new Object();

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            synchronized (m) {
                x = 10;
            }
        }, "t1");

        Thread t2 = new Thread(() -> {
            synchronized (m) {
                System.out.println(x);
            }
        }, "t2");

        t1.start();
        t2.start();
    }
}
