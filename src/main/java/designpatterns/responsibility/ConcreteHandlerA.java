package designpatterns.responsibility;

/**
 * 具体实现类
 *
 * @author happy
 * @since 2021-05-12
 */
public class ConcreteHandlerA extends Handler {
    @Override
    public void getRequest(String request) {
        if ("A".equalsIgnoreCase(request)) {
            System.out.println("ConcreteHandlerA");
        } else {
            if (getNext() != null) {
                getNext().getRequest(request);
            } else {
                System.out.println("no");
            }
        }
    }

    @Override
    public void setNext(Handler next) {
        super.setNext(next);
    }
}
