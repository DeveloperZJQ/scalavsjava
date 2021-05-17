package designpatterns.observer.demo1;

/**
 * @author happy
 * @since 2021-05-12
 */
public class ConcreteObserverB implements Observer {
    @Override
    public void response() {
        System.out.println("观察者B");
    }
}
