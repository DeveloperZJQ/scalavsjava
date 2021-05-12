package designpatterns.state;

/**
 * @author happy
 * @since 2021-05-12
 */
public class StateClient {
    public static void main(String[] args) {
        StateContext con = new StateContext(new ConcreteStateA());
        con.handle();
        con.handle();
        con.handle();
        con.handle();
        con.handle();
    }
}
