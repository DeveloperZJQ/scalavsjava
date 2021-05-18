package designpatterns.flyweight.demo1;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 享元工厂角色
 *
 * @author happy
 * @since 2021-05-08
 */
public class FlyweightFactory {
    private Map<String, Flyweight> flyweightMap = new HashMap<>();

    public Flyweight getFlyweight(String key) {
        Flyweight flyweight = flyweightMap.get(key);
        if (!Objects.isNull(flyweight)) {
            System.out.println("具体享元" + key + "已经存在，被成功获取！");
        } else {
            flyweight = new ConcreteFlyweight(key);
            flyweightMap.put(key, flyweight);
        }
        return flyweight;
    }
}
