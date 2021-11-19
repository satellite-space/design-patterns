package com.wxy.design.patterns.structural.adapter.clz;

/**
 * 电脑类
 * @author wxy
 * @version 1.0
 * @since 2021/11/19 16:39
 */
public class Computer {

    /**
     * 读取数据
     * @param sdCard sd卡
     * @return 读取的数据
     */
    public String read(SDCard sdCard) {
        return sdCard.readSD();
    }
}
