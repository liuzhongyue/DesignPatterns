package top.liuergo.observer.pratical;

import top.liuergo.observer.simple.Observer;

/**
 * @author liuergo
 * @description Kunkun粉丝
 * @date 2019-11-21 10:35
 */

public class Ikun implements Observer {
    private String name;

    public Ikun(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        //ikun更新自己的状态
        System.out.println(name + "收到了消息：" + message);
    }
}
