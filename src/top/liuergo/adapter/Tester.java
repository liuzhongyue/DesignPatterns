package top.liuergo.adapter;

import top.liuergo.adapter.computer.Computer;
import top.liuergo.adapter.computer.MacBook;
import top.liuergo.adapter.sd.SDCard;
import top.liuergo.adapter.sd.SDCardImplementation;
import top.liuergo.adapter.tf.TFCard;
import top.liuergo.adapter.tf.TFCardImplementation;

/**
 * @author liuergo
 * @description 测试类
 * @date 2019-11-23 21:15
 */

public class Tester {
    public static void main(String[] args) {
        SDCard sdCard = new SDCardImplementation();
        Computer computer = new MacBook();
        TFCard tfCard = new TFCardImplementation();
        SDAdapterTF adapter = new SDAdapterTF(tfCard);
        System.out.println(computer.readSD(adapter));
        System.out.println(computer.readSD(sdCard));
    }
}
