package designpatterns;

/**
 * @author happy
 * @since 2020-10-09
 */
public class StaticInnerSingleton {
    private StaticInnerSingleton(){};

    private static class StaticInnerSingletonIntance{
        private static final StaticInnerSingleton instance = new StaticInnerSingleton();
    }

    public static StaticInnerSingleton getInstance(){
        return StaticInnerSingletonIntance.instance;
    }
}
