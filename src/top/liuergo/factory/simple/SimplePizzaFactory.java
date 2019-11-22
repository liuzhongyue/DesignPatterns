package top.liuergo.factory.simple;

import java.security.PublicKey;

/**
 * @author liuergo
 * @description 披萨工厂类
 * @date 2019-11-21 21:24
 */

public class SimplePizzaFactory {
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if ("cheese".equals(type)) {
            pizza = new CheesePizza();
        } else if ("bacon".equals(type)) {
            pizza = new BaconPizza();
        }
        return pizza;
    }
}
