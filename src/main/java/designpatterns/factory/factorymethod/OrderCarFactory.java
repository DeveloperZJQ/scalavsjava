package designpatterns.factory.factorymethod;

/**
 * @author happy
 * @since 2021-04-15
 */
public class OrderCarFactory {
    public static void main(String[] args) {
        //工厂方法
        new WuLingFactory().getCar().name();
        new DaZhongFactory().getCar().name();
        new HavalFactory().getCar().name();
    }
}
