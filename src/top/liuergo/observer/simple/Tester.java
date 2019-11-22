package top.liuergo.observer.simple;

import top.liuergo.observer.simple.SpecificObserver;
import top.liuergo.observer.simple.SpecificSubject;

/**
 * @description: 测试类
 * @author liuergo
 * @date 2019-10-30 16:57
 */

public class Tester {
    public static void main(String[] args) {
        SpecificSubject subject = new SpecificSubject();
        subject.addObserver(new SpecificObserver("A"));
        subject.addObserver(new SpecificObserver("B"));
        subject.addObserver(new SpecificObserver("C"));
        subject.setState("haha");
        subject.setState("222");
    }
}
