package com.wxy.design.patterns.structural.adapter.obj;

/**
 * 适配者类
 * @author wxy
 * @version 1.0
 * @since 2021/11/19 16:28
 */
public interface TFCard {
    /**
     * 读取适配者类中的数据
     * @return 读出的数据
     */
    String readTF();

    /**
     * 写入适配者接口中的数据
     * @param msg 写入数据
     */
    void writeTF(String msg);
}
