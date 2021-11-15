package com.wxy.design.patterns.creational.factory.method;

/**
 * description: 工厂方法客户端 <br>
 * date: 2021/11/15 21:56 <br>
 * author: Administrator
 * version: 1.0 <br>
 */
public class Client {

    public static void main(String[] args) {
        CoffeeStore store = new CoffeeStore();
        CoffeeFactory factory = new AmericanCoffeeFactory();
        store.setFactory(factory);
        Coffee coffee = store.orderCoffee();
        System.out.println(coffee.getName());
    }

}
