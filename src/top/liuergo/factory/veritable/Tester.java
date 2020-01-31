package top.liuergo.factory.veritable;

import top.liuergo.factory.veritable.store.BeijingPizzaStore;
import top.liuergo.factory.veritable.store.ShanghaiPizzaStore;

/**
 * @author liuergo
 * @description 测试类
 * @date 2019-11-21 21:28
 */

public class Tester {
    public static void main(String[] args) {
        BeijingPizzaStore beijingPizzaStore = new BeijingPizzaStore();
        beijingPizzaStore.oderPizza("cheese");
        ShanghaiPizzaStore shanghaiPizzaStore = new ShanghaiPizzaStore();
        shanghaiPizzaStore.oderPizza("bacon");
    }
}
