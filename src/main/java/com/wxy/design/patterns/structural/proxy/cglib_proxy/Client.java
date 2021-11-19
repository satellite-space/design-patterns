package com.wxy.design.patterns.structural.proxy.cglib_proxy;

/**
 * 客户端
 * @author wxy
 * @version 1.0
 * @since 2021/11/19 15:20
 */
public class Client {
    public static void main(String[] args) {
        ProxyFactory proxyFactory = new ProxyFactory();
        TrainStation proxy = proxyFactory.getProxyFactory();
        proxy.sell();
    }
}
