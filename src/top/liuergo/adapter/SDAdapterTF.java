package top.liuergo.adapter;

import top.liuergo.adapter.sd.SDCard;
import top.liuergo.adapter.tf.TFCard;

/**
 * @author liuergo
 * @description SD适配TF
 * @date 2019-11-23 21:21
 */

public class SDAdapterTF implements SDCard {
    private TFCard tfCard;
    public SDAdapterTF(TFCard tfCard) {
        this.tfCard = tfCard;
    }
    @Override
    public String readSD() {
        System.out.println("Adapter read TF card");
        return tfCard.readTF();
    }

    @Override
    public boolean writeSD(String msg) {
        System.out.println("Adapter write TF card");
        return tfCard.writeTF(msg);
    }
}
