package com.wxy.design.patterns.creational.factory.simple;

/**
 * 咖啡店——当前类依赖于Coffee类
 */
public class CoffeeStore {

    /**
     * 获取一杯咖啡
     * @since 2021/11/15
     * @author wxy
     * @param type 咖啡类型
     * @return com.wxy.design.patterns.creational.factory.simple.Coffee
     **/
    public Coffee orderCoffee(String type) {
        SimpleCoffeeFactory factory = new SimpleCoffeeFactory();
        // 静态简单工厂使用
        Coffee coffee = StaticSimpleCoffeeFactory.createCoffee(type);
        return factory.createCoffee(type);
    }
}
