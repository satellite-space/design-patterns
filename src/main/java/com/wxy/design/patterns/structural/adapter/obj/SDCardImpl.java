package com.wxy.design.patterns.structural.adapter.obj;

/**
 * 适配者实现类
 * @author wxy
 * @version 1.0
 * @since 2021/11/19 16:35
 */
public class SDCardImpl implements SDCard {
    public String readSD() {
        return "read msg from SD Card";
    }

    public void writeSD(String msg) {
        System.out.println("write cd card msg is : " + msg);
    }
}
