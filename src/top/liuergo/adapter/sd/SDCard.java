package top.liuergo.adapter.sd;

/**
 * @author liuergo
 * @description SD卡
 * @date 2019-11-23 21:06
 */

public interface SDCard {
    /**
     * 读卡方法
     * @return 返回读到的信息
     */
    String readSD();

    /**
     * 写卡方法
     * @param msg 写入的信息
     * @return 返回写卡成功或失败
     */
    boolean writeSD(String msg);
}
