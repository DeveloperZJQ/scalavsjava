package designpatterns.facade.demo1;

/**
 * 外观模式 客户端
 *
 * @author happy
 * @since 2021-05-08
 */
public class FacadeClient {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.method();
    }
}
