package top.liuergo.factory.veritable;

import top.liuergo.factory.veritable.ingredient.Cheese;
import top.liuergo.factory.veritable.ingredient.Dough;
import top.liuergo.factory.veritable.ingredient.Sauce;

/**
 * @author liuergo
 * @description 披萨原料工厂
 * @date 2019-11-22 14:42
 */

public interface PizzaIngredientFactory {
    /**
     * 创建酱料的工厂方法
     * @return 酱料
     */
    Sauce createSauce();

    /**
     * 创建芝士的工厂方法
     * @return 芝士
     */
    Cheese createCheese();

    /**
     * 创建面胚的工厂方法
     * @return 面胚
     */
    Dough createDough();
}
