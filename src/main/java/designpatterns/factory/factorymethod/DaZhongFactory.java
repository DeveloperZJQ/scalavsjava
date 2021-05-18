package designpatterns.factory.factorymethod;

import designpatterns.factory.simplefactory.Car;
import designpatterns.factory.simplefactory.DaZhong;

/**
 * @author happy
 * @since 2021-04-15
 */
public class DaZhongFactory implements CarFactory{
    @Override
    public Car getCar() {
        return new DaZhong();
    }
}
