package designpatterns.bridge;

/**
 * @author happy
 * @since 2021-04-20
 */
public class Xiaomi implements PhoneFunction {
    @Override
    public void call() {
        System.out.println("it is xiaomi call.");
    }

    @Override
    public void net() {
        System.out.println("it is xiaomi net.");
    }
}
