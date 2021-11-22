package com.wxy.design.patterns.structural.facade;

/**
 * TV类
 *
 * @author wxy
 * @version 1.0
 * @since 2021/11/22 16:27
 */
public class TV {

    /**
     * 打开电视
     */
    public void on() {
        System.out.println("打开电视");
    }

    /**
     * 关闭电视
     */
    public void off() {
        System.out.println("关闭电视");
    }
}
