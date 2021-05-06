package designpatterns.proxy.demo1;

/**
 * @author happy
 * @since 2021-05-05
 */
public class RealSubjectImpl implements Subject {
    @Override
    public void request() {
        System.out.println("真实主题");
    }
}
