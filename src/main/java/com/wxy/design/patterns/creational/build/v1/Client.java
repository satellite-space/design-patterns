package com.wxy.design.patterns.creational.build.v1;

/**
 * description: 客户端
 *
 * @author wxy
 * @version 1.0
 * @since 2021/11/17 22:58
 */
public class Client {
    public static void main(String[] args) {
        BikeBuilder builder = new MobikeBuilder();
        Director director = new Director(builder);
        System.out.println(director.construct().toString());

        builder = new OfoBuilder();
        director = new Director(builder);
        System.out.println(director.construct());
    }
}
