package designpatterns.factory.factorymethod;

import designpatterns.factory.simplefactory.Car;
import designpatterns.factory.simplefactory.WuLing;

/**
 * @author happy
 * @since 2021-04-15
 */
public class WuLingFactory implements CarFactory{
    @Override
    public Car getCar() {
        return new WuLing();
    }
}
