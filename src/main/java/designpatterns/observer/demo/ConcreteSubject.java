package designpatterns.observer.demo;

/**
 * 具体话题实现类
 *
 * @author happy
 * @since 2021-05-12
 */
public class ConcreteSubject extends Subject {

    @Override
    public void notifyObserver() {
        System.out.println("具体目标发生改变...");
        System.out.println("-----------------------------");
        for (Observer obs : list) {
            obs.response();
        }
    }
}
