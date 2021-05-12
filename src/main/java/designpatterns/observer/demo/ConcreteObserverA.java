package designpatterns.observer.demo;

/**
 * 具体观察者A
 *
 * @author happy
 * @since 2021-05-12
 */
public class ConcreteObserverA implements Observer{
    @Override
    public void response() {
        System.out.println("观察者A");
    }
}
