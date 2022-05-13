package firstblood;

/**
 * @author DeveloperZJQ
 * @since 2022-5-12
 */
public class IndexOfTest {
    private static final String RSP="000,001,002,003,004,005";
    public static void main(String[] args) {
        boolean s = RSP.indexOf("0010")==-1;
        boolean contains = !RSP.contains("0010");
        System.out.println(s);
        System.out.println(contains);
    }
}
