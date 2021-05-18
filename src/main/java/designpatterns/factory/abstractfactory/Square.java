package designpatterns.factory.abstractfactory;

/**
 * @author happy
 * @since 2021-04-15
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("正方形");
    }
}
