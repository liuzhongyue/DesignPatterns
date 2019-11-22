package top.liuergo.observer.builtin;

/**
 * @author liuergo
 * @description 测试类
 * @date 2019-11-21 18:18
 */

public class Tester {
    public static void main(String[] args) {
        Kunkun kunkun = new Kunkun();
        kunkun.addObserver(new Ikun("11"));
        kunkun.addObserver(new Ikun("222"));
        kunkun.sendMessage("嘻嘻");
    }

}
