package com.wxy.design.patterns.structural.facade;

/**
 * 灯
 *
 * @author wxy
 * @version 1.0
 * @since 2021/11/22 16:27
 */
public class Light {

    /**
     * 打开灯
     */
    public void on() {
        System.out.println("打开灯");
    }

    /**
     * 关闭灯
     */
    public void off() {
        System.out.println("关闭灯");
    }
}
