package classLoad.demo;

import java.io.*;

/**
 * @author DeveloperZJQ
 * @since 2022-3-23
 */
public class CustomClassLoader extends ClassLoader {

    /**
     * 类的生命周期
     * 类加载器负责将java字节码文件加载到虚拟机内存中也就是类的生命周期的装载过程。（如下为类的生命周期）
     *
     * 验证-准备-解析  统称为 连接
     * 装载-验证-准备-解析-初始化-使用-卸载
     */

    /**
     * 类加载器==> 根类加载器 - 扩展类加载器 - 应用类加载器 - 用户自定义加载器
     */
    private String path;                //默认加载路径
    private String name;                //类加载器名称
    private final String fileType = ".class"; //文件类型

    protected CustomClassLoader() {
        super();
    }

    public CustomClassLoader(String name) {
        super();
        this.name = name;
    }

    public CustomClassLoader(ClassLoader parent, String name) {
        super(parent);
        this.name = name;
    }

    @Override
    protected Class<?> findClass(String name) {
        byte[] bytes = loadClassData(name);
        return defineClass(name, bytes, 0, bytes.length);
    }

    private byte[] loadClassData(String name) {
        byte[] data = null;
        InputStream in = null;
        name = name.replace(".", "/");
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        try {
            in = new FileInputStream(new File(path + name + fileType));
            int len = 0;
            while (-1 != (len = in.read())) {
                out.write(len);
            }

            data = out.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                in.close();
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return data;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String s) {
        this.path = path;
    }

    @Override
    public String toString() {
        return "CustomClassLoader{" +
                "path='" + path + '\'' +
                ", name='" + name + '\'' +
                ", fileType='" + fileType + '\'' +
                '}';
    }
}
