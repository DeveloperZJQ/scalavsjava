package designpatterns.bridge;

/**
 * @author happy
 * @since 2021-04-20
 */
public class Vivo implements PhoneFunction {
    @Override
    public void call() {
        System.out.println("it is vivo call.");
    }

    @Override
    public void net() {
        System.out.println("it it vivo net.");
    }
}
