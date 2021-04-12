package designpatterns.singleton;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @author happy
 * @since 2020-10-09
 * 懒汉式 方式二
 */
public class LazyOf2LockSingleton {
    //volatile 保证可见性
    private static volatile LazyOf2LockSingleton lazyOf2LockSingleton;

    private LazyOf2LockSingleton() {
    }

    ;

    /**
     * 懒汉式单例-双重锁
     * 解决线程安全问题、同时解决懒加载问题
     */
    public static LazyOf2LockSingleton getInstance() {
        if (lazyOf2LockSingleton == null) {
            synchronized (LazyOf2LockSingleton.class) {
                if (lazyOf2LockSingleton == null) {
                    lazyOf2LockSingleton = new LazyOf2LockSingleton();
                }
            }
        }
        return lazyOf2LockSingleton;
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
        Properties fileConfig = getInstance().getFileConfig("demo.properties");
        System.out.println(fileConfig);
    }
}
