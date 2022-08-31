package designpatterns.singleton;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @author happy
 * @since 2020-10-09
 */
public class StaticInnerSingleton {
    private StaticInnerSingleton() {
    }

    ;

    private static class StaticInnerSingletonInstance {
        private static final StaticInnerSingleton instance = new StaticInnerSingleton();
    }

    public static StaticInnerSingleton getInstance() {
        return StaticInnerSingletonInstance.instance;
    }

    //get local file config
    public Properties getFileConfig(String fileName) {
        Properties pro = new Properties();
        InputStream resourceAsStream = LazyOf2LockSingleton.class.getClassLoader().getResourceAsStream(fileName);

        try {
            pro.load(resourceAsStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return pro;
    }

    public static void main(String[] args) {
        StaticInnerSingleton.getInstance().getFileConfig("");
    }
}
