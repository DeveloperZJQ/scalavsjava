package designpatterns.singleton;

/**
 * @author DeveloperZJQ
 * @since 2022-8-26
 */
public class ClientSingleton {
    public static void main(String[] args) {
        EnumSingletonReview.INSTANCE.invokeMethod();
    }
}
