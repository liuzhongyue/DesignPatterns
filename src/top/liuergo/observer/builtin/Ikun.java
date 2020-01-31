package top.liuergo.observer.builtin;

import java.rmi.Naming;
import java.util.Observable;
import java.util.Observer;

/**
 * @author liuergo
 * @description ikun
 * @date 2019-11-21 11:38
 */

public class Ikun implements Observer {
    String name;
    public Ikun(String name){
        this.name = name;
    }
    @Override
    public void update(Observable o, Object arg) {
        System.out.println(name + "收到了" + arg);
    }
}
