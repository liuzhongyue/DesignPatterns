package top.liuergo.strategy.practical;

/**
 * @author liuergo
 * @description 测试
 * @date 2019-11-21 10:22
 */

public class Tester {
    public static void main(String[] args) {
        Consumer consumer = new Consumer();
        consumer.setBalance(20000);
        consumer.setPayment(new Alipay());
        consumer.usePayment(20);
        consumer.setPayment(new WechatPay());
        consumer.usePayment(100);
    }
}
