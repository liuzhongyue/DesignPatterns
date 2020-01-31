package top.liuergo.observer.simple;

import lombok.Data;

/**
 * @author liuergo
 * @description 具体的观察者类
 * @date 2019-11-21 10:17
 */

@Data
public class SpecificObserver implements Observer {
    private String name;
    public SpecificObserver(String name) {
        this.name = name;
    }
    @Override
    public void update(String state) {
        System.out.println("观察者"+ this.name + "收到消息:" + state);
    }
}
