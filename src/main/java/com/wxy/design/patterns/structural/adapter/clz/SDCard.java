package com.wxy.design.patterns.structural.adapter.clz;
/**
 * 目标接口类
 * @author wxy
 * @since 2021/11/19 16:32
 * @version 1.0
 */
public interface SDCard {
    /**
     * 读取目标接口类中的数据
     * @return 读出的数据
     */
    String readSD();

    /**
     * 写入目标接口类接口中的数据
     * @param msg 写入数据
     */
    void writeSD(String msg);
}
