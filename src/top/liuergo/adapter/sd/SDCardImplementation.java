package top.liuergo.adapter.sd;

/**
 * @author liuergo
 * @description SD卡实现类
 * @date 2019-11-23 21:09
 */

public class SDCardImplementation implements SDCard {
    @Override
    public String readSD() {
        String msg = "SD card read a msg: hello world";
        return msg;
    }

    @Override
    public boolean writeSD(String msg) {
        System.out.println("SD card write a msg: " + msg);
        return true;
    }
}
