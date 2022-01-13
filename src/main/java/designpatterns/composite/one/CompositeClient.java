package designpatterns.composite.one;

/**
 * @author happy
 * @since 2022/1/14
 */
public class CompositeClient {
    public static void main(String[] args) {
        Composite root = new Composite("ROOT");
        root.add(new Leaf("Leaf A"));
        root.add(new Leaf("Leaf B"));

        Composite comp = new Composite("Composite X");
        comp.add(new Leaf("Leaf XA"));
        comp.add(new Leaf("Leaf XB"));

        root.add(comp);

        Composite composite_xy = new Composite("Composite XY");
        composite_xy.add(new Leaf("Leaf XYA"));
        composite_xy.add(new Leaf("Leaf XYB"));

        comp.add(composite_xy);

        root.display(1);
    }
}
