package top.liuergo.factory.veritable;

import javax.security.auth.login.CredentialException;

/**
 * @author liuergo
 * @description 披萨店
 * @date 2019-11-21 22:15
 */

public abstract class PizzaStore {
    /**
     * 创建披萨的抽象方法
     * @param type
     * @return
     */
    public abstract Pizza createPizza(String type);
    public Pizza oderPizza(String type) {
        Pizza pizza;
        pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        return pizza;
    }
}
