package top.liuergo.factory.veritable;

import top.liuergo.factory.veritable.ingredient.*;

/**
 * @author liuergo
 * @description 北京的原料工厂
 * @date 2019-11-22 14:45
 */

public class BeijingIngredientFactory implements PizzaIngredientFactory{
    @Override
    public Sauce createSauce() {
        //使用上海的酱料
        return new ShanghaiSauce();
    }

    @Override
    public Cheese createCheese() {
        //使用北京的芝士
        return new BeijingCheese();
    }

    @Override
    public Dough createDough() {
        //使用北京的面胚
        return new BeijingDough();
    }
}
