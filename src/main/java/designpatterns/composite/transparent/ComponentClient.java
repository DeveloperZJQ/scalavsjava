package designpatterns.composite.transparent;

/**
 * 透明组合模式
 *
 * @author happy
 * @since 2021-05-05
 */
public class ComponentClient {
    public static void main(String[] args) {
        Component component1 = new Composite();
        Component component2 = new Composite();
        Component leaf1 = new Leaf("1");
        Component leaf2 = new Leaf("2");
        Component leaf3 = new Leaf("3");
        component1.add(leaf1);
        component1.add(leaf2);
        component1.add(leaf3);

        component1.add(component2);
        component2.add(leaf1);
        component1.operation();
    }
}
