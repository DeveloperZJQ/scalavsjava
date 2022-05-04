package concurrent.volatiledemo;

/**
 * @author happy
 * @since 2022/5/4
 */
public class HappensBefore2 {
    static int x;

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            x = 10;
        }, "t1");

        Thread t2 = new Thread(() -> {
            System.out.println(x);
        }, "t2");

        t1.start();
        t2.start();
    }
}
