package designpatterns.factory.abstractfactory;

/**
 * @author happy
 * @since 2021-04-15
 */
public class Circle implements Shape{
    @Override
    public void draw() {
        System.out.println("圆形");
    }
}
