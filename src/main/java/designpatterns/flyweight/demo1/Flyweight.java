package designpatterns.flyweight.demo1;

/**
 * 抽象享元角色
 *
 * @author happy
 * @since 2021-05-08
 */
public interface Flyweight {
    void operation(UnsharedConcreteFlyweight unsharedConcreteFlyweight);
}
