package com.wxy.design.patterns.creational.factory.abstract_factory;

/**
 * description: 甜品抽象工厂类 <br>
 * date: 2021/11/15 23:03 <br>
 * author: Administrator
 * version: 1.0 <br>
 */
public interface DessertFactory {
    /**
     * 生产咖啡
     * @return 咖啡实例
     */
    Coffee createCoffee();

    /**
     * 生产甜点
     * @return 甜点实例
     */
    Dessert createDessert();
}
