package designpatterns.decorator.demo1;

/**
 * 装饰类客户端
 *
 * @author happy
 * @since 2021-05-08
 */
public class DecoratorClient {
    public static void main(String[] args) {
        ConcreteDecoratorComponent concreteDecoratorComponent = new ConcreteDecoratorComponent();
        ConcreteDecorator concreteDecorator = new ConcreteDecorator(concreteDecoratorComponent);
        concreteDecorator.operator();
    }
}
