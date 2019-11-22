package top.liuergo.factory.veritable;

import top.liuergo.factory.veritable.ingredient.*;

/**
 * @author liuergo
 * @description 上海的原料工厂
 * @date 2019-11-22 15:06
 */

public class ShanghaiIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Sauce createSauce() {
        //使用上海的酱料
        return new BeijingSauce();
    }

    @Override
    public Cheese createCheese() {
        //使用北京的芝士
        return new ShanghaiCheese();
    }

    @Override
    public Dough createDough() {
        //使用北京的面胚
        return new ShanghaiDough();
    }
}
