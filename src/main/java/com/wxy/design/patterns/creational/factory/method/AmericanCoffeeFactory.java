package com.wxy.design.patterns.creational.factory.method;

/**
 * description: 美国咖啡工厂 <br>
 * date: 2021/11/15 21:48 <br>
 * author: Administrator
 * version: 1.0 <br>
 */
public class AmericanCoffeeFactory implements CoffeeFactory {
    public Coffee createCoffee() {
        return new AmericanCoffee();
    }
}
