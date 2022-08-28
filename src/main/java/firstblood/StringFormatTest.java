package firstblood;

/**
 * 练习String.format("first:%1$s,%2$s","a","b")
 *
 * @author DeveloperZJQ
 * @since 2022-6-7
 */
public class StringFormatTest {
    public static void main(String[] args) {
        String format = String.format("first:%1$s,%2$s","A","B");
        System.out.println(format);
    }
}