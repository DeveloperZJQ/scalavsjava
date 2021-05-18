package designpatterns.factory.abstractfactory;

/**
 * @author happy
 * @since 2021-04-15
 */
public class Blue implements Color{
    @Override
    public void fill() {
        System.out.println("蓝色");
    }
}
