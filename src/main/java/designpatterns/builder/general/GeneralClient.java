package designpatterns.builder.general;

/**
 * @author happy
 * @since 2021-04-16
 */
public class GeneralClient {
    public static void main(String[] args) {
        CommonHouse commonHouse = new CommonHouse();
        commonHouse.build();
    }
}
