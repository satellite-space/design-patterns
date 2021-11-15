package com.wxy.design.patterns.creational.factory.method;

/**
 * description: 工厂类接口 <br>
 * date: 2021/11/15 21:47 <br>
 * author: Administrator
 * version: 1.0 <br>
 */
public interface CoffeeFactory {
    /**
     * 创建咖啡方法
     * @return Coffee实例
     */
    Coffee createCoffee();
}
