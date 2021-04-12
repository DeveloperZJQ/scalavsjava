package designpatterns.singleton;

/**
 * @author happy
 * @since 2021-04-11
 * 懒汉式 -方式一- 线程不安全,只能在单线程下使用该方式,实际开发工作中,不能使用该方式
 */
public class LazySingleton {
    public static void main(String[] args) {

    }

    private static LazySingleton instance;

    private LazySingleton() {
    }

    public static LazySingleton getInstance(){
        if (instance == null){
            instance = new LazySingleton();
        }
        return instance;
    }
}
