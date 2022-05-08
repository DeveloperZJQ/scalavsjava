package concurrent.threadpool.custom;

/**
 * @author happy
 * @since 2022/5/9
 */
public class Client {
    public static void main(String[] args) {
        ThreadPool threadPool = new ThreadPool(5, 2);
        for (int i = 0; i < 10; i++) {
            int j = i;
            threadPool.execute(() -> {
                System.out.println("{}:" + j);
            });
        }
    }
}
