package designpatterns.factory.factorymethod;

import designpatterns.factory.simplefactory.Car;
import designpatterns.factory.simplefactory.Haval;

/**
 * @author happy
 * @since 2021-04-15
 */
public class HavalFactory implements CarFactory {
    @Override
    public Car getCar() {
        return new Haval();
    }
}
