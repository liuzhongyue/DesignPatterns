package top.liuergo.observer.simple;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liuergo
 * @description 具体的被观察者类
 * @date 2019-11-21 10:05
 */

public class SpecificSubject implements Subject {
    private List<Observer> observers;
    private String message;
    public SpecificSubject() {
        observers = new ArrayList<>();
    }
    @Override
    public void addObserver(Observer o) {
        //添加o到观察者List
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        //将o从观察者List中删除
        observers.remove(o);
    }

    @Override
    public void notifyAllObservers() {
        for (Observer o : observers) {
            o.update(this.message);
        }
    }

    public void setState(String message) {
        this.message = message;
        notifyAllObservers();
    }
}
