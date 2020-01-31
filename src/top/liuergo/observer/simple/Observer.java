package top.liuergo.observer.simple;

/**
 * @author liuergo
 * @description 观察者
 * @date 2019-11-21 09:58
 */

public interface Observer {
    /**
     * 更新观察者的状态
     * @param message 状态
     */
    public void update(String message);
}
