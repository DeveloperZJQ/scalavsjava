package designpatterns.composite.transparent;

/**
 * 抽象组件
 *
 * @author happy
 * @since 2021-05-05
 */
public interface Component {
    void add(Component component);

    void remove(Component component);

    Component getChild(int i);

    void operation();
}
