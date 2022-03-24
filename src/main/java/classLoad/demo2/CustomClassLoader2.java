package classLoad.demo2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author DeveloperZJQ
 * @since 2022-3-24
 */
public class CustomClassLoader2 extends ClassLoader {

    /**
     * 自定义类加载器实现方式之一
     */
    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        String cname = "D:\\workspace\\scalavsjava\\src\\main\\java\\" + name.replace(".", "\\") + ".class";
        byte[] classBytes = new byte[0];
        try {
            classBytes = Files.readAllBytes(Paths.get(cname));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Class<?> aClass = defineClass(name, classBytes, 0, classBytes.length);
        if (aClass == null) {
            throw new ClassNotFoundException(name);
        }
        return aClass;
    }
}
