package designpatterns.singleton;

/**
 * @author happy
 * @since 2020-10-09
 */
public class SingletonMain {
    public static void main(String[] args) {

        //饿汉式读取配置文件
        StarvationSingleton instance1 = StarvationSingleton.getInstance();
        StarvationSingleton instance2 = StarvationSingleton.getInstance();

        //懒汉式读取配置文件
        LazyOf2LockSingleton instanceOfLazy1 = LazyOf2LockSingleton.getInstance();
        LazyOf2LockSingleton instanceOfLazy2 = LazyOf2LockSingleton.getInstance();

        //静态内部类读取配置文件
        StaticInnerSingleton instanceOfStaticInner1 = StaticInnerSingleton.getInstance();
        StaticInnerSingleton instanceOfStaticInner2 = StaticInnerSingleton.getInstance();

        //枚举读取配置文件
        EnumSingleton.INSTANCE.getFileConfig("fileName");

        System.out.println(instance1.equals(instance2));
    }
}
