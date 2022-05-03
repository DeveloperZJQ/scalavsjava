package concurrent.waitnotifyqueue;

import java.util.LinkedList;

/**
 * @author happy
 * @since 2022/5/1
 */
public class MessageQueue {

    private LinkedList<Message> list = new LinkedList<>();
    private int capacity;

    //获取消息
    public Message take() {
        //检查对象是否为空
        synchronized (list) {
            while (list.isEmpty()) {
                try {
                    System.out.println("队列为空,消费者线程等待");
                    list.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            Message message = list.removeFirst();
            System.out.println("已经取走消息：" + message);
            list.notifyAll();
            return message;
        }
    }

    public MessageQueue(int capacity) {
        this.capacity = capacity;
    }

    //存入消息
    public void put(Message message) {
        synchronized (list) {
            //检查队列是否已经满了
            while (list.size() == capacity) {
                try {
                    System.out.println("队列已满,生产者等待");
                    list.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("已经生产消息: " + message);
            list.addLast(message);
            list.notifyAll();
        }
    }
}
