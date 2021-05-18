package designpatterns.command;

/**
 * 具体命令实现类B
 *
 * @author happy
 * @since 2021-05-11
 */
public class ConcreteCommandB implements Command{
    private ReceiverB receiverB;
    @Override
    public void execute() {
        receiverB.action();
    }

    public ConcreteCommandB(ReceiverB receiverB) {
        this.receiverB = receiverB;
    }
}
