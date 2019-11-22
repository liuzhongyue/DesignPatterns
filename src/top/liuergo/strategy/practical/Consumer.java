package top.liuergo.strategy.practical;

import lombok.Data;

/**
 * @author liuergo
 * @description 消费者
 * @date 2019-11-20 20:36
 */
@Data
public class Consumer {
    double balance;
    Payment payment;
    public void usePayment(double price) {
        this.balance = payment.pay(balance, price);
        System.out.println("当前余额:"+ this.balance);
    }
}
