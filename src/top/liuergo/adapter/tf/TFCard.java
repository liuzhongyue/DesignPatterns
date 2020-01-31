package top.liuergo.adapter.tf;

/**
 * @author liuergo
 * @description TF卡
 * @date 2019-11-23 21:18
 */

public interface TFCard {
    /**
     * 读卡方法
     * @return 返回读到的信息
     */
    String readTF();

    /**
     * 写卡方法
     * @param msg 写入的信息
     * @return 返回写卡成功或失败
     */
    boolean writeTF(String msg);
}
