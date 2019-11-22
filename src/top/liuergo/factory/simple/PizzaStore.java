package top.liuergo.factory.simple;

/**
 * @author liuergo
 * @description 披萨店
 * @date 2019-11-21 22:15
 */

public class PizzaStore {
    SimplePizzaFactory factory;
    public PizzaStore (SimplePizzaFactory factory) {
        this.factory = factory;
    }
    public Pizza oderPizza(String type) {
        Pizza pizza;
        pizza = factory.createPizza(type);
        pizza.bake();
        pizza.cut();
        return pizza;
    }

}
