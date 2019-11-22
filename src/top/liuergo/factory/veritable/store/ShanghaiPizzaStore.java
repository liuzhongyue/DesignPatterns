package top.liuergo.factory.veritable.store;

import top.liuergo.factory.veritable.Pizza;
import top.liuergo.factory.veritable.PizzaStore;
import top.liuergo.factory.veritable.ShanghaiIngredientFactory;
import top.liuergo.factory.veritable.pizza.BeijingBaconPizza;
import top.liuergo.factory.veritable.pizza.BeijingCheesePizza;
import top.liuergo.factory.veritable.pizza.ShanghaiBaconPizza;
import top.liuergo.factory.veritable.pizza.ShanghaiCheesePizza;

/**
 * @author liuergo
 * @description 上海披萨店
 * @date 2019-11-21 23:59
 */

public class ShanghaiPizzaStore extends PizzaStore {
    private ShanghaiIngredientFactory shanghaiIngredientFactory = new ShanghaiIngredientFactory();
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if ("cheese".equals(type)) {
            pizza = new ShanghaiCheesePizza(shanghaiIngredientFactory);
        } else if ("bacon".equals(type)) {
            pizza = new ShanghaiBaconPizza(shanghaiIngredientFactory);
        }
        return pizza;
    }
}
