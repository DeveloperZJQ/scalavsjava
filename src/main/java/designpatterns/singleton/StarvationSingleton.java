package designpatterns.singleton;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @author happy
 * @since 2020-10-09
 */
public class StarvationSingleton {

    private static final StarvationSingleton starvationInstance = new StarvationSingleton();

    private StarvationSingleton(){};

    public static StarvationSingleton getInstance(){
        return starvationInstance;
    }

    /**
     * read local file
     * @param fileName
     * @return
     */
    public Properties getFileConfig(String fileName){
        Properties pro = new Properties();
        InputStream resourceAsStream = StarvationSingleton.class.getClassLoader().getResourceAsStream(fileName);
        try {
            pro.load(resourceAsStream);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return pro;
    }
}
