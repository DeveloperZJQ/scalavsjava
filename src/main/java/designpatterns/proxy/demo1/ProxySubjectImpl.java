package designpatterns.proxy.demo1;

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
        System.out.println("预处理");
    }

    public static void callBack() {
        System.out.println("事后处理");
    }
}
