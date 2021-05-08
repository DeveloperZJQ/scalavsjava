package designpatterns.decorator.demo1;

/**
 * 抽象装饰类
 *
 * @author happy
 * @since 2021-05-08
 */
public abstract class Decorator implements DecoratorComponent {
    private DecoratorComponent decoratorComponent;

    public Decorator(DecoratorComponent decoratorComponent) {
        this.decoratorComponent = decoratorComponent;
    }

    @Override
    public void operator() {
        decoratorComponent.operator();
    }
}
