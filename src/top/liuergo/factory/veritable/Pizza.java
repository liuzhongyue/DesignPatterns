package top.liuergo.factory.veritable;

import top.liuergo.factory.veritable.ingredient.Cheese;
import top.liuergo.factory.veritable.ingredient.Dough;
import top.liuergo.factory.veritable.ingredient.Sauce;

/**
 * @author liuergo
 * @description 披萨类
 * @date 2019-11-21 21:18
 */

public abstract class Pizza {
    Sauce sauce;
    Cheese cheese;
    Dough dough;

    /**
     * 将准备方法修改为抽象方法，子类必须重写该方法
     */
    public abstract void prepare();

    /**
     * 烘焙方法
     */
    public void bake(){};
    /**
     * 披萨切片的方法
     */
    public void cut(){};
}
