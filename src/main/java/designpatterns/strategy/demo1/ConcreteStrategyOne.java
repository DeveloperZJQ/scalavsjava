package designpatterns.strategy.demo1;

/**
 * 具体实现类1
 *
 * @author happy
 * @since 2021-05-11
 */
public class ConcreteStrategyOne implements Strategy {
    @Override
    public void strategyMethod() {
        System.out.println("具体实现类ConcreteStrategyOne 被调用！");
    }
}
