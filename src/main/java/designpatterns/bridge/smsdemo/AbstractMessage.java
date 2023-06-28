package designpatterns.bridge.smsdemo;

/**
 * @author happy
 * @link <a href="https://www.cnblogs.com/lgg20/p/11095537.html">...</a>
 * @since 2021-04-20
 */
public abstract class AbstractMessage {
    //持有一个实现部分的对象
    MessageImplementor impl;

    /**
     * 构造方法，传入实现部分的对象
     */
    public AbstractMessage(MessageImplementor impl) {
        this.impl = impl;
    }

    /**
     * 发送消息，委派给实现部分的方法
     */
    public void sendMessage(String message, String toUser) {
        this.impl.send(message, toUser);
    }
}