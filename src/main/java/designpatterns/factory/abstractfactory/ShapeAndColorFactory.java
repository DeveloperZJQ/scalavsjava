package designpatterns.factory.abstractfactory;

/**
 * @author happy
 * @since 2021-04-15
 */
public class ShapeAndColorFactory extends AbstractFactory{
    @Override
    public Color getColor(String color) {
        Color colorRes = null;
        switch (color){
            case "red"://禁止出现魔法值,我偷个懒
                colorRes = new Red();
                break;
            case "blue":
                colorRes = new Blue();
                break;
            case "white":
                colorRes = new White();
                break;
            default:
                break;
        }
        return colorRes;
    }

    @Override
    public Shape getShape(String shape) {
        Shape shapeRes = null;
        switch (shape){
            case "circle":
                shapeRes = new Circle();
                break;
            case "square":
                shapeRes = new Square();
                break;
            case "rectangle":
                shapeRes = new Rectangle();
                break;
            default:
                break;
        }
        return shapeRes;
    }
}
