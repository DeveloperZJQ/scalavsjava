package concurrent.waitnotifyqueue;

/**
 * @author happy
 * @since 2022/5/1
 */
public class AsyncClient {
    public static void main(String[] args) {
        MessageQueue messageQueue = new MessageQueue(2);

        for (int i = 0; i < 3; i++) {
            int id = i;
            new Thread(() -> {
                messageQueue.put(new Message(id, "value" + id));
            }, "生产者" + i).start();
        }

        new Thread(() -> {
            while (true) {
                Message take = messageQueue.take();
                System.out.println(take);
            }
        }, "消费者").start();
    }
}
