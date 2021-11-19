package com.wxy.design.patterns.structural.adapter.clz;

/**
 * tfcard实现类
 * @author wxy
 * @since 2021/11/19 16:31
 * @version 1.0
 */
public class TFCardImpl implements TFCard {
    public String readTF() {
        return "read msg from tf card";
    }

    public void writeTF(String msg) {
        System.out.println("write tf card msg is : " + msg);
    }
}
