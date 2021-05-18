package designpatterns.factory.abstractfactory;

/**
 * @author happy
 * @since 2021-04-15
 */
public class OrderClient {
    public static void main(String[] args) {
        ShapeAndColorFactory shapeAndColorFactory = new ShapeAndColorFactory();
        shapeAndColorFactory.getColor("red").fill();
        shapeAndColorFactory.getShape("circle").draw();
    }
}
