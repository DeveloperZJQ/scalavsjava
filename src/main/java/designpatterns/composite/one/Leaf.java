package designpatterns.composite.one;

/**
 * @author happy
 * @since 2022/1/14
 */
public class Leaf extends Component{
    public Leaf(String name) {
        super(name);
    }

    @Override
    public void add(Component c) {
        System.out.println("cannot add to a leaf");
    }

    @Override
    public void remove(Component c) {
        System.out.println("cannot remove to a leaf");
    }

    @Override
    public void display(int depth) {
        System.out.println("_"+depth+name);
    }
}
