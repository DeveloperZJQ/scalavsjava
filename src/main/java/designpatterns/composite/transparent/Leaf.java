package designpatterns.composite.transparent;

/**
 * @author happy
 * @since 2021-05-05
 */
public class Leaf implements Component {
    private String name;

    public Leaf(String name) {
        this.name = name;
    }

    @Override
    public void add(Component component) {

    }

    @Override
    public void remove(Component component) {

    }

    @Override
    public Component getChild(int i) {
        return null;
    }

    @Override
    public void operation() {
        System.out.println("Leaf " + name + " : 被访问！");
    }
}
