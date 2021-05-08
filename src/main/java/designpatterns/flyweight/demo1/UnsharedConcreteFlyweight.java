package designpatterns.flyweight.demo1;

/**
 * 非享元角色
 *
 * @author happy
 * @since 2021-05-08
 */
public class UnsharedConcreteFlyweight {
    private String info;

    public UnsharedConcreteFlyweight(String info) {
        this.info = info;
    }

    public String getInfo() {
        return info;
    }
}
