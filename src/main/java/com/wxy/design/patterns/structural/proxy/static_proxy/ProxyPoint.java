package com.wxy.design.patterns.structural.proxy.static_proxy;

import com.wxy.design.patterns.structural.proxy.jdk_proxy.SellTickets;
import com.wxy.design.patterns.structural.proxy.jdk_proxy.TrainStation;

/**
 * description:
 * 静态代理——真实主题类
 * 代理销售点
 * @author wxy
 * @version 1.0
 * @since 2021/11/18 21:50
 */
public class ProxyPoint implements SellTickets {

    /**
     * 火车站(真实案例应保持单例)
     */
    private final TrainStation trainStation = new TrainStation();

    public void sell() {
        System.out.println("额外收取10元手续费");
        trainStation.sell();
    }
}
