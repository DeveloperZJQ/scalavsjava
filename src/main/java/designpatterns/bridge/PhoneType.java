package designpatterns.bridge;

/**
 * @author happy
 * @since 2021-04-20
 */
public abstract class PhoneType {

    //组合手机功能
    private PhoneFunction phoneFunction;

    //构造器
    public PhoneType(PhoneFunction phoneFunction) {
        super();
        this.phoneFunction = phoneFunction;
    }

    protected void close() {
        phoneFunction.net();
    }

    protected void call() {
        phoneFunction.call();
    }
}
