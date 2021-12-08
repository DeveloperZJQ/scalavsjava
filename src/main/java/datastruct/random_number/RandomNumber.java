package datastruct.random_number;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * 随机数
 *
 * @author happy
 * @since 2021-11-28
 */
public class RandomNumber {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>() {{
            add("12");
            add("123");
            add("124");
            add("125");
            add("126");
            add("127");
        }};
        int j = 100;
        while (j > 2) {
            int i = new Random().nextInt(list.size() - 1);

            System.out.println(list.get(i));
            j--;
        }
    }
}
