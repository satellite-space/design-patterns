package com.wxy.design.patterns.creational.build.v2;

/**
 * description: 简化版中客户端
 *
 * @author wxy
 * @version 1.0
 * @since 2021/11/17 23:05
 */
public class Client {
    public static void main(String[] args) {
        BikeBuilder builder = new MobikeBuilder();
        System.out.println(builder.construct());
        builder = new OfoBuilder();
        System.out.println(builder.construct());
    }
}
