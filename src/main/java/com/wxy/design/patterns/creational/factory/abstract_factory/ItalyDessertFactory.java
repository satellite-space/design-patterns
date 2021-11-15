package com.wxy.design.patterns.creational.factory.abstract_factory;

/**
 * description: 意大利风味甜品具体工厂类——用于生产同一产品族的产品，拿铁咖啡、提拉米苏
 * date: 2021/11/15 23:06 <br>
 * author: Administrator
 * version: 1.0 <br>
 */
public class ItalyDessertFactory implements DessertFactory {
    public Coffee createCoffee() {
        return new LatteCoffee();
    }

    public Dessert createDessert() {
        return new Tiramisu();
    }
}
