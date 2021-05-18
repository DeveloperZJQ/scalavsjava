package designpatterns.factory.simplefactory;

/**
 * @author happy
 * @since 2021-04-15
 */
public class SimpleFactory {
    public static Car getCar(String carType) {
        Car car = null;
        if (carType.equals("DaZhong")) {
            car = new DaZhong();
        } else if (carType.equals("haval")) {
            car = new Haval();
        } else if (carType.equals("wuling")) {
            car = new WuLing();
        } else {
            System.out.println("no match car.");
        }
        return car;
    }
}
