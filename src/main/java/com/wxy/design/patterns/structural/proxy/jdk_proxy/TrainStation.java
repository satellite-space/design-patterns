package com.wxy.design.patterns.structural.proxy.jdk_proxy;

/**
 * description:
 * JDK动态代理——真实主题类
 * 火车站
 * @author wxy
 * @version 1.0
 * @since 2021/11/18 21:49
 */
public class TrainStation implements SellTickets {
    public void sell() {
        System.out.println("火车站销售一张票");
    }
}
