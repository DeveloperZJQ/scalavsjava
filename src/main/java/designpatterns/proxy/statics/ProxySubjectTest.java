package designpatterns.proxy.statics;

/**
 * @author happy
 * @since 2021-05-05
 */
public class ProxySubjectTest {
    public static void main(String[] args) {
        ProxySubjectImpl proxySubject = new ProxySubjectImpl();
        proxySubject.request();
    }
}
