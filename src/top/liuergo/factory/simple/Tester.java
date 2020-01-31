package top.liuergo.factory.simple;

/**
 * @author liuergo
 * @description 测试类
 * @date 2019-11-21 21:28
 */

public class Tester {
    public static void main(String[] args) {
        PizzaStore pizzaStore = new PizzaStore(new SimplePizzaFactory());
        pizzaStore.oderPizza("cheese");
        pizzaStore.oderPizza("bacon");
    }
}
