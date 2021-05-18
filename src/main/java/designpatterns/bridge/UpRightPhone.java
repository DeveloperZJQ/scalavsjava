package designpatterns.bridge;

/**
 * @author happy
 * @since 2021-04-20
 */
public class UpRightPhone extends PhoneType{
    public UpRightPhone(PhoneFunction phoneFunction) {
        super(phoneFunction);
    }

    @Override
    protected void close() {
        super.close();
    }

    @Override
    protected void call() {
        super.call();
    }
}
