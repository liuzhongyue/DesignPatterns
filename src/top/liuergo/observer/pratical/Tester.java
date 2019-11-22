package top.liuergo.observer.pratical;

/**
 * @author liuergo
 * @description 测试类
 * @date 2019-11-21 10:46
 */

public class Tester {
    public static void main(String[] args) {
        Ikun ikunA = new Ikun("张三");
        Ikun ikunB = new Ikun("李四");
        Kunkun kunkun = new Kunkun();
        kunkun.addObserver(ikunA);
        kunkun.addObserver(ikunB);
        kunkun.sendMessage("我是练习时常两年半的偶像练习生，喜欢唱、跳、rap、篮球~");
    }

}
