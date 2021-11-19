package com.wxy.design.patterns.structural.proxy.jdk_proxy;

/**
 * description: JDK动态代理客户端
 *
 * @author wxy
 * @version 1.0
 * @since 2021/11/18 22:25
 */
public class Client {
    public static void main(String[] args) {
        ProxyFactory proxyFactory = new ProxyFactory();
        SellTickets proxy = proxyFactory.getProxyObject();
        proxy.sell();
    }
}
