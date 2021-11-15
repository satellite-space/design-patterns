package com.wxy.design.patterns.creational.factory.abstract_factory;

/**
 * description: 测试类 <br>
 * date: 2021/11/15 23:08 <br>
 * author: Administrator
 * version: 1.0 <br>
 */
public class Client {
    public static void main(String[] args) {
        AmericanDessertFactory factory = new AmericanDessertFactory();
        Coffee coffee = factory.createCoffee();
        Dessert dessert = factory.createDessert();
        System.out.println(coffee.getName());
        dessert.show();
    }
}
