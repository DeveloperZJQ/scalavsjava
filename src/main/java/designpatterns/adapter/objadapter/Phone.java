package designpatterns.adapter.objadapter;

import designpatterns.adapter.classadapter.Voltage220V;

/**
 * @author happy
 * @since 2021-04-19
 * 手机充电
 */
public class Phone {
    public void charging(IVoltage5V iVoltage5V){
        if (iVoltage5V.output5V()==5){
            System.out.println("5V  充电安全");
        }else{
            System.out.println("220V 充电电池爆炸");
        }
    }

    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.charging(new VoltageAdapter(new Voltage220V()));
    }
}
