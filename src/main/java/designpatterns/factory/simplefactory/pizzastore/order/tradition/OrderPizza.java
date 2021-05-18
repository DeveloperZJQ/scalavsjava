package designpatterns.factory.simplefactory.pizzastore.order.tradition;

import designpatterns.factory.simplefactory.pizzastore.pizza.CheesePizza;
import designpatterns.factory.simplefactory.pizzastore.pizza.GreekPizza;
import designpatterns.factory.simplefactory.pizzastore.pizza.PepperPizza;
import designpatterns.factory.simplefactory.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author happy
 * @since 2021-04-12
 */
public class OrderPizza {

    //构造器
    public OrderPizza() {
        Pizza pizza = null;
        String orderType;   //订购pizza类型
        do {
            orderType = getType();
            if (orderType.equals("greek")) {
                pizza = new GreekPizza();
                pizza.setName("希腊披萨");
            } else if (orderType.equals("cheese")) {
                pizza = new CheesePizza();
                pizza.setName("奶酪披萨");
            } else if (orderType.equals("pepper")){
                pizza = new PepperPizza();
                pizza.setName("胡椒披萨");
            }else {
                break;
            }
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();

        } while (true);
    }

    //写一个方法，可以获取客户希望订阅的披萨种类
    private String getType() {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("请输入订购的pizza类型：");
        try {
            return bufferedReader.readLine();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }
}
