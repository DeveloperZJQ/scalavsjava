package designpatterns.command;

/**
 * 具体实现类
 *
 * @author happy
 * @since 2021-05-11
 */
public class ConcreteCommandA implements Command {
    private ReceiverA receiver;

    public ConcreteCommandA(ReceiverA receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.action();
    }
}
