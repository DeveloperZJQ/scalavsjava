package designpatterns.singleton;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @author happy
 * @since 2021-04-11
 * 饿汉式 方式二 : 静态代码块饿汉式
 */
public class StarvationSingleton2 {
    private StarvationSingleton2() {
    }

    private static StarvationSingleton2 instance;

    static {
        instance = new StarvationSingleton2();
    }

    public static StarvationSingleton2 getInstance() {
        return instance;
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
        StarvationSingleton2 instance1 = StarvationSingleton2.getInstance();
        StarvationSingleton2 instance2 = StarvationSingleton2.getInstance();
        System.out.println(instance1==instance2);
        System.out.println(instance1);
        System.out.println(instance2);
    }
}
