package com.wxy.design.patterns.creational.factory.abstract_factory;

/**
 * description: 美式风味甜品具体工厂类——用于生产同一产品族的产品，美式咖啡、抹茶慕斯
 * date: 2021/11/15 23:05 <br>
 * author: Administrator
 * version: 1.0 <br>
 */
public class AmericanDessertFactory implements DessertFactory {
    public Coffee createCoffee() {
        return new AmericanCoffee();
    }

    public Dessert createDessert() {
        return new MatchaMousse();
    }
}
