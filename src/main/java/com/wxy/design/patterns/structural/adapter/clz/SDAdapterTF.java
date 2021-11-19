package com.wxy.design.patterns.structural.adapter.clz;

/**
 * 适配器类
 * sd卡适配tf卡
 * @author wxy
 * @version 1.0
 * @since 2021/11/19 16:41
 */
public class SDAdapterTF extends TFCardImpl implements SDCard {
    public String readSD() {
        return readTF();
    }

    public void writeSD(String msg) {
        System.out.println("通过sd将数据写入tf卡");
        writeTF(msg);
    }
}
