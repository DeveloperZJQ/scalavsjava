package classLoad.demo;

/**
 * @author DeveloperZJQ
 * @since 2022-3-24
 */
public class Color {
    public Color() {
        System.out.println("Color is loaded by "+this.getClass().getClassLoader());
    }
}
