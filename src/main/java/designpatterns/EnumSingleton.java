package designpatterns;

/**
 * @author happy
 * @since 2020-10-09
 * 1)线程安全问题。因为Java虚拟机在加载枚举类的时候会使用ClassLoader的方法，这个方法使用了同步代码块来保证线程安全。
 * 2）避免反序列化破坏对象，因为枚举的反序列化并不通过反射实现
 */
public enum  EnumSingleton {
    INSTANCE;
    public void m(){}
}
