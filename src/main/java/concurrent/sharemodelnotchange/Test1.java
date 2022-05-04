package concurrent.sharemodelnotchange;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * 线程不可变
 * @author happy
 * @since 2022/5/4
 */
public class Test1 {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                try {
                    System.out.println("" + sdf.parse("1951-04-21"));
                } catch (ParseException e) {
                    e.printStackTrace();
                }
            }).start();
        }
    }
}
