package designpatterns.singleton;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @author happy
 * @since 2020-10-09
 * 饿汉式 方式一 : 静态常量饿汉式
 */
public class StarvationSingleton {

    private static final StarvationSingleton starvationInstance = new StarvationSingleton();

    private StarvationSingleton() {
    }

    ;

    public static StarvationSingleton getInstance() {
        return starvationInstance;
    }

    /**
     * read local file
     */
    public Properties getFileConfig(String fileName) {
        Properties pro = new Properties();
        InputStream resourceAsStream = StarvationSingleton.class.getClassLoader().getResourceAsStream(fileName);
        try {
            pro.load(resourceAsStream);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return pro;
    }

    public static void main(String[] args) {
        StarvationSingleton instance1 = StarvationSingleton.getInstance();
        StarvationSingleton instance2 = StarvationSingleton.getInstance();
        System.out.println(instance1==instance2);
        System.out.println(instance1);
        System.out.println(instance2);
    }
}
