package top.liuergo.factory.veritable.pizza;

import top.liuergo.factory.veritable.Pizza;
import top.liuergo.factory.veritable.PizzaIngredientFactory;

/**
 * @author liuergo
 * @description 上海的培根披萨
 * @date 2019-11-21 23:54
 */

public class ShanghaiBaconPizza extends Pizza {
    private PizzaIngredientFactory ingredientFactory;
    public ShanghaiBaconPizza(PizzaIngredientFactory ingredientFactory) {
        System.out.println("做一个上海BaconPizza");
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        ingredientFactory.createSauce();
        ingredientFactory.createDough();
        ingredientFactory.createCheese();
    }
}
