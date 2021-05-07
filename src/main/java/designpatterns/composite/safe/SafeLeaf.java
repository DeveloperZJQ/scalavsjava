package designpatterns.composite.safe;

import designpatterns.composite.transparent.Component;

/**
 * @author happy
 * @since 2021-05-05
 */
public class SafeLeaf implements SafeComponent {
    private String name;

    public SafeLeaf(String name) {
        this.name = name;
    }

    public void add(SafeComponent component) {

    }

    @Override
    public void operator() {
        System.out.println("Leaf " + name + " : 被访问！");

    }
}
