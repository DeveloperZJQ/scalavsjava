package classLoad.demo;

/**
 * @author DeveloperZJQ
 * @since 2022-3-24
 */
public class TestClassLoader {
    public static void main(String[] args) {
        CustomClassLoader loader1 = new CustomClassLoader("loader1");
        loader1.setPath("D:\\test\\loader1");
        CustomClassLoader loader2 = new CustomClassLoader(loader1, "loader2");
        loader2.setPath("D:\\test\\loader2");
        CustomClassLoader loader3 = new CustomClassLoader(null, "loader3");
        loader3.setPath("D:\\test\\loader3");

        loadClassByMyClassLoader("classLoad.demo.Red",loader2);
        loadClassByMyClassLoader("classLoad.demo.Red",loader3);
    }

    private static void loadClassByMyClassLoader(String name, ClassLoader loader) {
        Class<?> aClass = null;
        try {
            aClass = loader.loadClass(name);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            Object o = aClass.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
