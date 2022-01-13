package designpatterns.composite.one;

import java.util.ArrayList;
import java.util.List;

/**
 * @author happy
 * @since 2022/1/14
 */
public class Composite extends Component {
    private List<Component> children = new ArrayList<>();

    public Composite(String name) {
        super(name);
    }

    @Override
    public void add(Component c) {
        children.add(c);
    }

    @Override
    public void remove(Component c) {
        children.remove(c);
    }

    @Override
    public void display(int depth) {
        System.out.println("_"+depth+name);
        for (Component child : children) {
            child.display(depth+2);
        }
    }
}
