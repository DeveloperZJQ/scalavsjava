package designpatterns.strategy.demo1;

/**
 * 环境类
 *
 * @author happy
 * @since 2021-05-11
 */
public class ContextStrategy {
    private Strategy strategy;

    public ContextStrategy() {
    }

    public ContextStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void strategyMethod() {
        strategy.strategyMethod();
    }
}
