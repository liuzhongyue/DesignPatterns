package top.liuergo.factory.veritable.pizza;

import top.liuergo.factory.veritable.Pizza;
import top.liuergo.factory.veritable.PizzaIngredientFactory;

/**
 * @author liuergo
 * @description 上海芝士披萨
 * @date 2019-11-21 23:57
 */

public class ShanghaiCheesePizza extends Pizza {
    private PizzaIngredientFactory ingredientFactory;
    public ShanghaiCheesePizza(PizzaIngredientFactory ingredientFactory) {
        System.out.println("做一个上海CheesePizza");
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        ingredientFactory.createSauce();
        ingredientFactory.createDough();
        ingredientFactory.createCheese();
    }
}
