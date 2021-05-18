package designpatterns.responsibility;

/**
 * @author happy
 * @since 2021-05-12
 */
public class ConcreteHandlerB extends Handler {

    @Override
    public void getRequest(String request) {
        if ("B".equalsIgnoreCase(request)) {
            System.out.println("ConcreteHandlerB");
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
