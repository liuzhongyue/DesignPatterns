package top.liuergo.strategy.practical;

/**
 * @author liuergo
 * @description 支付策略
 * @date 2019-11-20 20:31
 */

public interface Payment {
    /**
     * 支付方法
     * @param balance 消费前的余额
     * @param price 消费的物品的价格
     * @return 返回消费之后的余额
     */
    double pay(double balance, double price);
}
