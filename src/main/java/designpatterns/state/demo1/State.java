package designpatterns.state.demo1;

/**
 * 抽象状态类
 *
 * @author happy
 * @since 2021-05-12
 */
public abstract class State {

    public abstract void handler(StateContext context);
}
