package top.liuergo.strategy.simple;

/**
 * @author liuergo
 * @description 具体的策略对象
 * @date 2019-11-20 16:13
 */

public class SpecificStrategyA implements Strategy{
    @Override
    public void algorithmStatement() {
        System.out.println("算法A");
    }
}
