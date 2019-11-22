package top.liuergo.factory.simple;

/**
 * @author liuergo
 * @description 芝士披萨
 * @date 2019-11-21 21:21
 */

public class CheesePizza implements Pizza {
    public CheesePizza() {
        System.out.println("做一个CheesePizza");
    }
    @Override
    public void bake() {

    }

    @Override
    public void cut() {

    }
}
