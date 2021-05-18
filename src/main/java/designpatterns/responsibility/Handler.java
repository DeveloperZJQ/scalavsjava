package designpatterns.responsibility;

/**
 * @author happy
 * @since 2021-05-12
 */
public abstract class Handler {
    private Handler next;

    public void setNext(Handler next) {
        this.next = next;
    }

    public Handler getNext() {
        return next;
    }

    public abstract void getRequest(String request);
}
