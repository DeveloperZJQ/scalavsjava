package designpatterns.factory.simplefactory.pizzastore.pizza;

/**
 * @author happy
 * @since 2021-04-12
 * 简单工厂-抽象类
 */
public abstract class Pizza {
    private String name;

    public abstract void prepare();

    public void bake() {
        System.out.println(name + " baking");
    }

    public void cut() {
        System.out.println(name + " cutting");
    }

    public void box() {
        System.out.println(name + " boxing");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
