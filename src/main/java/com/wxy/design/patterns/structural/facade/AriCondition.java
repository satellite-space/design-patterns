package com.wxy.design.patterns.structural.facade;

/**
 * 空调
 *
 * @author wxy
 * @version 1.0
 * @since 2021/11/22 16:27
 */
public class AriCondition {

    /**
     * 打开空调
     */
    public void on() {
        System.out.println("打开空调");
    }

    /**
     * 关闭空调
     */
    public void off() {
        System.out.println("关闭空调");
    }
}
