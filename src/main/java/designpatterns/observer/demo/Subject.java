package designpatterns.observer.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * 抽象主题类
 *
 * @author happy
 * @since 2021-5-12
 */
public abstract class Subject {
    protected List<Observer> list = new ArrayList<>();

    //增加观察者方法
    public void add(Observer observer) {
        list.add(observer);
    }

    //增加观察者方法
    public void remove(Observer observer) {
        list.remove(observer);
    }

    //通知观察者方法
    public abstract void notifyObserver();
}
