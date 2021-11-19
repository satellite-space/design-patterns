package com.wxy.design.patterns.structural.proxy.static_proxy;

/**
 * description: 静态代理案例客户端
 *
 * @author wxy
 * @version 1.0
 * @since 2021/11/18 21:52
 */
public class Client {
    public static void main(String[] args) {
        ProxyPoint proxyPoint = new ProxyPoint();
        proxyPoint.sell();
    }
}
