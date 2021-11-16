package com.wxy.design.patterns.creational.factory.config_factory;

/**
 * description: 简单工厂加配置文件咖啡工厂客户端 <br>
 * date: 2021/11/16 21:50 <br>
 * author: Administrator
 * version: 1.0 <br>
 */
public class Client {
    public static void main(String[] args) {
        Coffee latte = CoffeeFactory.createCoffee("latte");
        System.out.println(latte.getName());
    }
}
