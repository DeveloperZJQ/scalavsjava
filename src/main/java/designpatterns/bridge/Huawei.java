package designpatterns.bridge;

/**
 * @author happy
 * @since 2021-04-20
 */
public class Huawei implements PhoneFunction {
    @Override
    public void call() {
        System.out.println("it is huawei call.");
    }

    @Override
    public void net() {
        System.out.println("it is huawei net.");
    }
}
