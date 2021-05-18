package designpatterns.proxy.statics;

import java.util.Objects;

/**
 * @author happy
 * @since 2021-05-05
 */
public class ProxySubjectImpl implements Subject {
    private RealSubjectImpl realSubject;

    @Override
    public void request() {
        if (Objects.isNull(realSubject)) {
            realSubject = new RealSubjectImpl();
        }
        preRequest();
        realSubject.request();
        callBack();
    }

    public static void preRequest() {
        System.out.println("访问真实主题之前的预处理");
    }

    public static void callBack() {
        System.out.println("访问真实主题之后的事后处理");
    }
}
