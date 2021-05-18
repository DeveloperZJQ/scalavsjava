package designpatterns.strategy.demo1;

/**
 * @author happy
 * @since 2021-05-11
 */
public class StrategyClient {
    public static void main(String[] args) {
        ContextStrategy one = new ContextStrategy();
        ConcreteStrategyOne concreteStrategyOne = new ConcreteStrategyOne();
        one.setStrategy(concreteStrategyOne);
        one.strategyMethod();
        one.setStrategy(new ConcreteStrategyTwo());
        one.strategyMethod();
    }
}
