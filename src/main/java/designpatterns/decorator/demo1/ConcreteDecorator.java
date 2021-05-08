package designpatterns.decorator.demo1;

/**
 * 具体装饰实现类
 *
 * @author happy
 * @since 2021-05-08
 */
public class ConcreteDecorator extends Decorator {
    public ConcreteDecorator(DecoratorComponent decoratorComponent) {
        super(decoratorComponent);
    }

    @Override
    public void operator() {
        super.operator();
        addOtherFunction();
    }

    public void addOtherFunction(){
        System.out.println("为装饰组件类增加其他额外功能.");
    }
}
