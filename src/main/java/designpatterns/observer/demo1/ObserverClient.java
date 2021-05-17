package designpatterns.observer.demo1;

/**
 * 观察者客户端
 *
 * @author happy
 * @since 2021-05-12
 */
public class ObserverClient {
    public static void main(String[] args) {
        ConcreteSubject concreteSubject = new ConcreteSubject();
        ConcreteObserverA concreteObserverA = new ConcreteObserverA();
        ConcreteObserverB concreteObserverB = new ConcreteObserverB();
        concreteSubject.add(concreteObserverA);
        concreteSubject.add(concreteObserverB);
        concreteSubject.notifyObserver();
    }
}
