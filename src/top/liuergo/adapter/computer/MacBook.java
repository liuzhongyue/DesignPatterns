package top.liuergo.adapter.computer;

import top.liuergo.adapter.sd.SDCard;

/**
 * @author liuergo
 * @description MacBook
 * @date 2019-11-23 21:13
 */

public class MacBook implements Computer {
    @Override
    public String readSD(SDCard sdCard) {
        String errorMsg = "SD card is null!";
        if (sdCard == null) {
            throw new NullPointerException(errorMsg);
        }
        return sdCard.readSD();
    }
}
