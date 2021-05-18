package designpatterns.factory.simplefactory.pizzastore.order.simplefactory;

import designpatterns.factory.simplefactory.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author happy
 * @since 2021-04-12
 */
public class SimpleFactoryOrderPizza {

    //定义一个简单工厂对象
    SimpleFactory simpleFactory;
    Pizza pizza = null;

    //构造器
    public SimpleFactoryOrderPizza(SimpleFactory simpleFactory) {
        setSimpleFactory(simpleFactory);
    }

    public void setSimpleFactory(SimpleFactory simpleFactory) {
        String orderType = ""; //用户输入
        this.simpleFactory = simpleFactory; //设置简单工厂对象
        do {
            orderType = getType();
            pizza = this.simpleFactory.createOrderPizza(orderType);
            //输出pizza的信息
            if (pizza != null) {   //订购成功
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            } else {
                System.out.println("订购披萨失败");
                break;
            }
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
