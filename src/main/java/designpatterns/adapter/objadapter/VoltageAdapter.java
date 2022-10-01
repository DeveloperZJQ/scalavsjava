package designpatterns.adapter.objadapter;

/**
 * @author happy
 * @since 2021-04-19
 * 转换类 220V-> 5v
 */
public class VoltageAdapter implements IVoltage5V {

    private designpatterns.adapter.classadapter.Voltage220V voltage220V; // 关联关系-聚合

    public VoltageAdapter(designpatterns.adapter.classadapter.Voltage220V voltage220V) {
        this.voltage220V = voltage220V;
    }

    @Override
    public int output5V() {
        int src = voltage220V.output220V();
        return src / 44;
    }
}

