package designpatterns.composite.safe;

import java.util.ArrayList;
import java.util.List;

/**
 * @author happy
 * @since 2021-05-05
 */
public class SafeComposite implements SafeComponent {
    private List<SafeComponent> list = new ArrayList<>();

    @Override
    public void operator() {
        for (SafeComponent safeComponent : list) {
            safeComponent.operator();
        }
    }

    public void add(SafeComponent safeComponent) {
        list.add(safeComponent);
    }
}
