package top.liuergo.strategy.practical;

/**
 * @author liuergo
 * @description 支付宝支付
 * @date 2019-11-20 20:31
 */

public class Alipay implements Payment{
    @Override
    public double pay(double balance, double price) {
        //各种支付方式中此部分逻辑肯定不同
        System.out.println("正在打开支付宝...");
        System.out.println("使用支付宝支付了" + price + "元");
        return balance - price;
    }
}
