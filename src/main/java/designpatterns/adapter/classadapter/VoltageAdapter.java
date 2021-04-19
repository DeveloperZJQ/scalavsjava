package designpatterns.adapter.classadapter;

/**
 * @author happy
 * @since 2021-04-19
 * 转换类 220V-> 5v
 */
public class VoltageAdapter extends Voltage220V implements IVoltage5V {
    @Override
    public int output5V() {
        int src = output220V();
        return src/44;
    }

    @Override
    public int output220V() {
        return super.output220V();
    }
}
