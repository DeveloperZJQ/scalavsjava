package designpatterns.flyweight.demo1;

/**
 * 享元客户端
 *
 * @author happy
 * @since 2021-05-05
 */
public class FlyweightClient {
    public static void main(String[] args) {
        FlyweightFactory factory = new FlyweightFactory();
        factory.getFlyweight("a").operation(new UnsharedConcreteFlyweight("info-a"));
        factory.getFlyweight("b");
        factory.getFlyweight("c");
        factory.getFlyweight("a");
        factory.getFlyweight("b");
        Flyweight c = factory.getFlyweight("c");
        c.operation(new UnsharedConcreteFlyweight("info1"));

    }
}
