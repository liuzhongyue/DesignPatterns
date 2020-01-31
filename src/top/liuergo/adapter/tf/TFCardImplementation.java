package top.liuergo.adapter.tf;

/**
 * @author liuergo
 * @description TF卡实现类
 * @date 2019-11-23 21:19
 */

public class TFCardImplementation implements TFCard {
    @Override
    public String readTF() {
        String msg = "TF card read a msg: hello world";
        return msg;
    }

    @Override
    public boolean writeTF(String msg) {
        System.out.println("SD card write a msg: " + msg);
        return true;
    }
}
