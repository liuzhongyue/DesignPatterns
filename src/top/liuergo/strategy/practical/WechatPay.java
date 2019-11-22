package top.liuergo.strategy.practical;

/**
 * @author liuergo
 * @description 微信支付
 * @date 2019-11-20 20:35
 */

public class WechatPay implements Payment {
    @Override
    public double pay(double balance, double price) {
        //各种支付方式中此部分逻辑肯定不同
        System.out.println("正在打开微信...");
        System.out.println("使用微信支付了" + price + "元");
        return balance - price;
    }
}
