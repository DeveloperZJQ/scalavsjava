package designpatterns.composite.transparent;

import java.util.ArrayList;

/**
 * @author happy
 * @since 2021-05-05
 */
public class Composite implements Component {
    private ArrayList<Component> list = new ArrayList<>();

    @Override
    public void add(Component component) {
        list.add(component);
    }

    @Override
    public void remove(Component component) {
        list.remove(component);
    }

    @Override
    public Component getChild(int i) {
        return list.get(i);
    }

    @Override
    public void operation() {
        for (Component obj : list) {
            obj.operation();
        }
    }
}
