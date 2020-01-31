package top.liuergo.observer.pratical;

import top.liuergo.observer.simple.Observer;
import top.liuergo.observer.simple.Subject;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liuergo
 * @description 蔡徐坤
 * @date 2019-11-21 10:31
 */

public class Kunkun implements Subject {
    private List<Observer> ikuns;
    private String message;

    public Kunkun() {
        ikuns = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer o) {
        //为Kunkun增加一个ikun
        ikuns.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        //将一个ikun踢出粉丝群
        ikuns.remove(o);
    }

    @Override
    public void notifyAllObservers() {
        for (Observer ikun : ikuns) {
            ikun.update(this.message);
        }
    }

    public void sendMessage(String message) {
        this.message = message;
        notifyAllObservers();
    }
}
