package top.liuergo.factory.veritable.store;

import top.liuergo.factory.veritable.BeijingIngredientFactory;
import top.liuergo.factory.veritable.Pizza;
import top.liuergo.factory.veritable.PizzaIngredientFactory;
import top.liuergo.factory.veritable.PizzaStore;
import top.liuergo.factory.veritable.pizza.BeijingBaconPizza;
import top.liuergo.factory.veritable.pizza.BeijingCheesePizza;

/**
 * @author liuergo
 * @description 北京的披萨店
 * @date 2019-11-21 23:52
 */

public class BeijingPizzaStore extends PizzaStore {
    private BeijingIngredientFactory beijingIngredientFactory = new BeijingIngredientFactory();
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if ("cheese".equals(type)) {
            pizza = new BeijingCheesePizza(beijingIngredientFactory);
        } else if ("bacon".equals(type)) {
            pizza = new BeijingBaconPizza(beijingIngredientFactory);
        }
        return pizza;
    }
}
