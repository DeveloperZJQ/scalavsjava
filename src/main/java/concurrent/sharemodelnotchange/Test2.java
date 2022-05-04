package concurrent.sharemodelnotchange;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;

/**
 * @author happy
 * @since 2022/5/4
 */
public class Test2 {
    public static void main(String[] args) {
        DateTimeFormatter stf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        for (int i = 0; i < 10; i++) {
            new Thread(()->{
                TemporalAccessor parse = stf.parse("1951-04-21");
                System.out.println(Thread.currentThread().getName()+" "+parse+"");
            }).start();
        }
    }

    private static void test() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                synchronized (sdf) {
                    try {
                        System.out.println("" + sdf.parse("1951-04-21"));
                    } catch (ParseException e) {
                        e.printStackTrace();
                    }
                }
            }).start();
        }
    }
}
