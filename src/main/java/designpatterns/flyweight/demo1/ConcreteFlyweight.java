package designpatterns.flyweight.demo1;

/**
 * 具体实现享元类
 *
 * @author happy
 * @since 2021-05-08
 */
public class ConcreteFlyweight implements Flyweight {
    private final String key;

    public ConcreteFlyweight(String key) {
        this.key = key;
        System.out.println("具体享元" + key + "被创建！");
    }

    @Override
    public void operation(UnsharedConcreteFlyweight unsharedConcreteFlyweight) {
        System.out.println("具体享元" + key + "被调用！");
        System.out.println("非享元" + unsharedConcreteFlyweight.getInfo() + "被调用！");
    }
}
