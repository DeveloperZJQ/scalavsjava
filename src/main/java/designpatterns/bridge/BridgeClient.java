package designpatterns.bridge;

/**
 * @author happy
 * @since 2021-04-20
 */
public class BridgeClient {
    public static void main(String[] args) {
        FoldedPhone foldedPhone = new FoldedPhone(new Huawei());
        UpRightPhone upRightPhone = new UpRightPhone(new Huawei());
    }
}
