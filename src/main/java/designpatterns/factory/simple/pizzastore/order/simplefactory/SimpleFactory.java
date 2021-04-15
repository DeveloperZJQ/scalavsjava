package designpatterns.factory.simple.pizzastore.order.simplefactory;

import designpatterns.factory.simple.pizzastore.pizza.CheesePizza;
import designpatterns.factory.simple.pizzastore.pizza.GreekPizza;
import designpatterns.factory.simple.pizzastore.pizza.PepperPizza;
import designpatterns.factory.simple.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author happy
 * @since 2021-04-12
 * 简单工厂类
 */
public class SimpleFactory {

    /**
     * 根据orderType返回对应的披萨实例
     */
    public Pizza createOrderPizza(String orderType) {
        Pizza pizza = null;
        if (orderType.equals("greek")) {
            pizza = new GreekPizza();
            pizza.setName("希腊披萨");
        } else if (orderType.equals("cheese")) {
            pizza = new CheesePizza();
            pizza.setName("奶酪披萨");
        } else if (orderType.equals("pepper")) {
            pizza = new PepperPizza();
            pizza.setName("胡椒披萨");
        }

        return pizza;
    }
}
