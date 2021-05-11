package designpatterns.strategy.demo1;

/**
 * 具体实现类2
 *
 * @author happy
 * @since 2021-05-11
 */
public class ConcreteStrategyTwo implements Strategy {
    @Override
    public void strategyMethod() {
        System.out.println("具体实现类ConcreteStrategyTwo 被调用！");
    }
}
