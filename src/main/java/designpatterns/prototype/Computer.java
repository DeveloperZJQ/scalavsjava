package designpatterns.prototype;

/**
 * @author happy
 * @since 2021-04-16
 */
public class Computer implements Cloneable {
    //颜色
    private String colour;
    //品牌
    private String brand ;

    public Computer(String colour, String brand) {
        this.colour = colour;
        this.brand = brand;
    }

    public Computer() {
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "colour='" + colour + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
