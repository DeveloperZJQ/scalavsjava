package concurrent;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.*;

/**
 * @author happy
 * @since 2022/5/1
 */
public class DownLoader {
    public static void main(String[] args) {
        GuardedObject guardedObject = new GuardedObject();
        new Thread(() -> {
            //等待结果
            List<String> list = (List<String>) guardedObject.get(2000);
            System.out.println(list.size());
        }, "t1").start();

        new Thread(() -> {
            List<String> download = null;
            try {
                download = DownLoader.download();
            } catch (IOException e) {
                e.printStackTrace();
            }
            guardedObject.complete(download);
        }, "t2").start();
    }

    public static List<String> download() throws IOException {
        HttpURLConnection conn = (HttpURLConnection) new URL("https://www.baidu.com/").openConnection();
        List<String> lines = new ArrayList<>();
        try (BufferedReader reader =
                     new BufferedReader(new InputStreamReader(conn.getInputStream(), StandardCharsets.UTF_8))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
        }
        return lines;
    }

}

class MailBoxes {
    private static Map<Integer, GuardedObject> boxes = new Hashtable<>();
    private static int id = 1;

    private static synchronized int generateId() {
        return id++;
    }

    public static GuardedObject getGuardedObject(int id) {
        return boxes.remove(id);
    }

    public static GuardedObject createGuardedObject() {
        GuardedObject go = new GuardedObject(generateId());
        boxes.put(go.getId(), go);
        return go;
    }

    public static Set<Integer> getIds() {
        return boxes.keySet();
    }
}

class Postman extends Thread {
    private int id;
    private String mail;

    public Postman(int id, String mail) {
        this.id = id;
        this.mail = mail;
    }

    @Override
    public void run() {
        GuardedObject guardedObject = MailBoxes.getGuardedObject(id);
        guardedObject.complete(mail);
    }
}

class People extends Thread {
    @Override
    public void run() {
        GuardedObject guardedObject = MailBoxes.createGuardedObject();
        System.out.println(guardedObject.getId());
        Object mail = guardedObject.get(5000);
        System.out.println(guardedObject.getId() + ":" + mail);
    }
}

class GuardedObject {
    private Object response;
    private Integer id;

    public GuardedObject() {
    }

    public GuardedObject(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public Object get(long timeout) {
        synchronized (this) {
            long begin = System.currentTimeMillis();
            long passedTime = 0;
            while (response == null) {
                try {
                    if (passedTime >= timeout) {
                        break;
                    }
                    this.wait();
                    long end = System.currentTimeMillis();
                    passedTime = end - begin;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            return response;
        }
    }

    //产生结果
    public void complete(Object response) {
        synchronized (this) {
            //给结果成员变量赋值
            this.response = response;
            this.notifyAll();
        }
    }

}
