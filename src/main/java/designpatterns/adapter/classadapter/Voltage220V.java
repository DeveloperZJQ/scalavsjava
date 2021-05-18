package designpatterns.adapter.classadapter;

/**
 * @author happy
 * @since 2021-04-19
 * 被适配得类
 */
public class Voltage220V {
    public int output220V() {
        int src = 220;
        System.out.println("电压=" + src + "伏");
        return src;
    }
}