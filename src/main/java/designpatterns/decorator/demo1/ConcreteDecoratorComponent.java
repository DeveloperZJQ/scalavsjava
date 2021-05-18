package designpatterns.decorator.demo1;

/**
 * 具体装饰组件实现类
 *
 * @author happy
 * @since 2021-05-08
 */
public class ConcreteDecoratorComponent implements DecoratorComponent {
    public ConcreteDecoratorComponent() {
        System.out.println("创建具体构件.");
    }

    @Override
    public void operator() {
        System.out.println("this is 具体装饰组件实现类.");
    }
}
