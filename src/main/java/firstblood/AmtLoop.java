package firstblood;

/**
 * @author DeveloperZJQ
 * @since 2022-6-9
 */
public class AmtLoop {
    public static void main(String[] args) {
        double basicAmt = 575;
        double rate = 1.2;
        int recursiveCnt = 10;

        for (int i = 0; i < recursiveCnt; i++) {
            basicAmt = basicAmt * rate;
        }
        System.out.println(basicAmt);
    }

}
