package concurrent.threadpool.custom;

/**
 * @author DeveloperZJQ
 * @since 2022-5-9
 */
public class Client {
    public static void main(String[] args) {
        CustomThreadPool customThreadPool = new CustomThreadPool(2, 10);
        for (int i = 0; i < 10; i++) {
            int j = i;
            customThreadPool.execute(() -> {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("{}:" + j);
            });
        }
    }
}
