package designpatterns.strategy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author happy
 * @since 2020-10-10 13:01
 * 策略模式主类
 */
public class StrategyMain {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("1","111");
        map.put("2","222");
        map.put("3","1111");
        System.out.println(map);
    }
}
