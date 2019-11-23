package top.liuergo.factory.veritable.pizza;

import top.liuergo.factory.veritable.Pizza;
import top.liuergo.factory.veritable.PizzaIngredientFactory;

/**
 * @author liuergo
 * @description 芝士披萨
 * @date 2019-11-21 21:21
 */

public class BeijingCheesePizza extends Pizza {
    private PizzaIngredientFactory ingredientFactory;
    public BeijingCheesePizza(PizzaIngredientFactory ingredientFactory) {
        System.out.println("做一个北京CheesePizza");
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        ingredientFactory.createSauce();
        ingredientFactory.createDough();
        ingredientFactory.createCheese();
    }
}
