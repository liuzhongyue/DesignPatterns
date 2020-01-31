package top.liuergo.factory.veritable.pizza;

import top.liuergo.factory.veritable.Pizza;
import top.liuergo.factory.veritable.PizzaIngredientFactory;

/**
 * @author liuergo
 * @description 培根披萨
 * @date 2019-11-21 21:23
 */

public class BeijingBaconPizza extends Pizza {
    private PizzaIngredientFactory ingredientFactory;
    public BeijingBaconPizza(PizzaIngredientFactory ingredientFactory) {
        System.out.println("做一个北京BaconPizza");
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        ingredientFactory.createSauce();
        ingredientFactory.createDough();
        ingredientFactory.createCheese();
    }
}
