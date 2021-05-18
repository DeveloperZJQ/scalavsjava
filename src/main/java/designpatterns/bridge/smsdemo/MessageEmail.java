package designpatterns.bridge.smsdemo;

/**
 * @author happy
 * @since 2021-04-20
 */
public class MessageEmail implements MessageImplementor {

    @Override
    public void send(String message, String toUser) {
        System.out.println("使用邮件短消息的方法，发送消息'" + message + "'给" + toUser);
    }

}