package top.liuergo.adapter.computer;

import top.liuergo.adapter.sd.SDCard;

/**
 * @author liuergo
 * @description 计算机接口
 * @date 2019-11-23 21:11
 */

public interface Computer {
    /**
     * 读取SD卡的方法
     * @param sdCard SD卡
     * @return 返回读取SD卡的信息
     */
    String readSD (SDCard sdCard);
}
