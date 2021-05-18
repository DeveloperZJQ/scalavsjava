package designpatterns.proxy.statics;

/**
 * @author happy
 * @since 2021-05-05
 */
public class RealSubjectImpl implements Subject {
    @Override
    public void request() {
        System.out.println("访问真实主题。");
    }
}
