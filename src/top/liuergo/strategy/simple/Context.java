package top.liuergo.strategy.simple;

/**
 * @author liuergo
 * @description Context上下文对象
 * @date 2019-11-20 16:16
 */

public class Context {
    private Strategy strategy;
    public Context() {
    }
    /**
     * 执行策略的具体方法
     */
    public void executeStrategy() {
        strategy.algorithmStatement();
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
}
