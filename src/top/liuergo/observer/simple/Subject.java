package top.liuergo.observer.simple;

/**
 * @author liuergo
 * @description 被观察者
 * @date 2019-11-21 09:59
 */

public interface Subject {
    /**
     * 为该Subject添加观察者
     * @param o 一个观察者对象
     */
    public void addObserver(Observer o);

    /**
     * 删除某个观察者
     * @param o 一个观察者对象
     */
    public void removeObserver(Observer o);

    /**
     * 通知所有观察者
     */
    public void notifyAllObservers();


}
