package classLoad.demo2;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author DeveloperZJQ
 * @since 2022-3-24
 */
public class ClassLoaderTest2 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        CustomClassLoader2 loader2 = new CustomClassLoader2();

        //调用loadClass加载sample.loader.SayHello2类
        //无法加载到该类, 因此会调用findClass方法
        Class<?> aClass = loader2.loadClass("classLoad.demo2.SayHello2");
        Method main = aClass.getMethod("main", String[].class);
        main.invoke(null, (Object) new String[]{});
    }
}
