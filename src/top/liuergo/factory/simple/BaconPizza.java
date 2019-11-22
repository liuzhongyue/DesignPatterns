package top.liuergo.factory.simple;

/**
 * @author liuergo
 * @description 培根披萨
 * @date 2019-11-21 21:23
 */

public class BaconPizza implements Pizza {
    public BaconPizza() {
        System.out.println("做一个BaconPizza");
    }
    @Override
    public void bake() {

    }

    @Override
    public void cut() {

    }
}
