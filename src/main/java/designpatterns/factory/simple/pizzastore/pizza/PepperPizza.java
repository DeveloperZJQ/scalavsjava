package designpatterns.factory.simple.pizzastore.pizza;

/**
 * @author happy
 * @since 2021-04-12
 */
public class PepperPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println(" 增加胡椒种类的披萨");
    }

    @Override
    public void bake() {
        super.bake();
    }

    @Override
    public void cut() {
        super.cut();
    }

    @Override
    public void box() {
        super.box();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }
}
