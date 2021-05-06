package designpatterns.proxy.dynamic;

/**
 * @author happy
 * @since 2021-05-05
 */
public class Client {
    public static void main(String[] args) {
        IPerson TomInstance = new JDKFuDao().getInstance(new Tom());
        TomInstance.findPerformTeacher();

        for (int i = 1; i <= 5; i++) {
            System.out.println("thinking and waiting " + i + " s");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        IPerson LiyInstance = new JDKFuDao().getInstance(new Liy());
        LiyInstance.findPerformTeacher();
    }
}
