package designpatterns.command;

/**
 * 命令客户端
 *
 * @author happy
 * @since 2021-05-11
 */
public class CommandClient {
    public static void main(String[] args) {
        Command concreteCommand = new ConcreteCommandA(new ReceiverA());
        concreteCommand.execute();

        System.out.println("----------------分界线----------------");
        Invoker invoker = new Invoker(concreteCommand);
        invoker.call();
        invoker.setCommand(new ConcreteCommandB(new ReceiverB()));
        invoker.call();
    }
}
