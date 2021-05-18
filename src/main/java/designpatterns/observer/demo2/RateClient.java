package designpatterns.observer.demo2;

/**
 * @author happy
 * @since 2021-05-17
 */
public class RateClient {
    public static void main(String[] args) {
        Rate rate = new RMBRate();
        Company watcher1 = new ImportCompany();
        Company watcher2 = new ExportCompany();
        rate.add(watcher1);
        rate.add(watcher2);
        rate.change(10);
        rate.change(-9);
    }
}
