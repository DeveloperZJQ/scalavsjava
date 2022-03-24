package classLoad.demo;

/**
 * @author DeveloperZJQ
 * @since 2022-3-24
 */
public class Red extends Color {
    public Red() {
        System.out.println("Red is loaded by " + this.getClass().getClassLoader());
    }
}
