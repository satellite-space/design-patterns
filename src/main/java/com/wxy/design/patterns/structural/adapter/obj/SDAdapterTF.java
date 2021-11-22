package com.wxy.design.patterns.structural.adapter.obj;

/**
 * 适配器类
 * sd卡适配tf卡
 * @author wxy
 * @version 1.0
 * @since 2021/11/19 16:41
 */
public class SDAdapterTF implements SDCard {

    /**
     * 聚合客户类（适配者类）
     */
    private TFCard tfCard;

    public SDAdapterTF(TFCard tfCard) {
        this.tfCard= tfCard;
    }

    public String readSD() {
        return tfCard.readTF();
    }

    public void writeSD(String msg) {
        System.out.println("通过sd将数据写入tf卡");
        tfCard.writeTF(msg);
    }
}
