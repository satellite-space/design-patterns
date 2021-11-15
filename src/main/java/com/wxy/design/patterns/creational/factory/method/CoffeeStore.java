package com.wxy.design.patterns.creational.factory.method;

/**
 * 咖啡店——当前类依赖于Coffee类
 */
public class CoffeeStore {

    /**
     * 咖啡工厂
     */
    private CoffeeFactory factory;

    public void setFactory(CoffeeFactory factory) {
        this.factory = factory;
    }

    /**
     * 获取一杯咖啡
     * @since 2021/11/15
     * @author wxy
     * @return com.wxy.design.patterns.creational.factory.simple.Coffee
     **/
    public Coffee orderCoffee() {
        Coffee coffee = factory.createCoffee();
        coffee.addMilk();
        coffee.addSugar();
        return coffee;
    }
}
