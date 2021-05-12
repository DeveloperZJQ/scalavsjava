package designpatterns.state;

/**
 * @author happy
 * @since 2021-05-12
 */
public class ConcreteStateB extends State{
    @Override
    public void handler(StateContext context) {
        System.out.println("B");
        context.setState(new ConcreteStateA());
    }
}
