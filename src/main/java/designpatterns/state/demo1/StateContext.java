package designpatterns.state.demo1;

/**
 * 状态上下文
 *
 * @author happy
 * @since 2021-05-12
 */
public class StateContext {
    private State state;

    public StateContext(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void handle(){
        state.handler(this);
    }
}
