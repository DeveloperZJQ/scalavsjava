package designpatterns.factory.simplefactory;

/**
 * @author happy
 * @since 2021-04-15
 */
public class OrderCar {
    public static void main(String[] args) {
        //简单工厂又称静态工厂模式
        SimpleFactory.getCar("haval").name();
        SimpleFactory.getCar("DaZhong").name();
    }
}
