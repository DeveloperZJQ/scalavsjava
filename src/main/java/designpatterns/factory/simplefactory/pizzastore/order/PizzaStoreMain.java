package designpatterns.factory.simplefactory.pizzastore.order;

import designpatterns.factory.simplefactory.pizzastore.order.simplefactory.SimpleFactory;
import designpatterns.factory.simplefactory.pizzastore.order.simplefactory.SimpleFactoryOrderPizza;

/**
 * @author happy
 * @since 2021-04-12
 */
public class PizzaStoreMain {
    public static void main(String[] args) {
        //方式一 传统方式
//        new OrderPizza();

        //方式二 简单工厂模式
        new SimpleFactoryOrderPizza(new SimpleFactory());
    }
}
