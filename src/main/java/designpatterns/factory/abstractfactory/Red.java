package designpatterns.factory.abstractfactory;

/**
 * @author happy
 * @since 2021-04-15
 */
public class Red implements Color {
    @Override
    public void fill() {
        System.out.println("红色");
    }
}
