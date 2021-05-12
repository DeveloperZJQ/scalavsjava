package designpatterns.responsibility;

/**
 * 职责链 客户端
 *
 * @author happy
 * @since 2021-05-12
 */
public class HandlerClient {
    public static void main(String[] args) {
        Handler concreteHandlerA = new ConcreteHandlerA();
        Handler concreteHandlerB = new ConcreteHandlerB();
        concreteHandlerA.setNext(concreteHandlerB);

        concreteHandlerA.getRequest("A");
    }
}
