package designpatterns.state;

/**
 * 具体状态实现类A
 *
 * @author happy
 * @since 2021-5-12
 */
public class ConcreteStateA extends State{
    @Override
    public void handler(StateContext context) {
        System.out.println("A");
        context.setState(new ConcreteStateB());
    }
}
