package com.wxy.design.patterns.creational.factory.method;

/**
 * description: 拿铁咖啡生产工厂 <br>
 * date: 2021/11/15 21:52 <br>
 * author: Administrator
 * version: 1.0 <br>
 */
public class LatterCoffeeFactory implements CoffeeFactory {
    public Coffee createCoffee() {
        return new LatteCoffee();
    }
}
