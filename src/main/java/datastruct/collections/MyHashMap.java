package datastruct.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author happy
 * @since 2022/4/17
 */
public class MyHashMap {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        ConcurrentHashMap<String, String> concurrentHashMap = new ConcurrentHashMap<>();
        map.put(null, null);
        map.put("1", "first");
        map.put("2", "third");


        Double a = 100d;
        Long la = 100L;
        Integer laa = 100;
        byte ba = 127;
        System.out.println(a.hashCode());
        System.out.println(la.hashCode());
        System.out.println(laa.hashCode());
        System.out.println(ba);
        System.out.println(map.size());
        System.out.println(map);
    }
}
