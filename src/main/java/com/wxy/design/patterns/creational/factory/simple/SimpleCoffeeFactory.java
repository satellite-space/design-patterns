package com.wxy.design.patterns.creational.factory.simple;

/**
 * 简单的咖啡工厂
 *
 * @author wxy
 * @version 1.0
 * @since 2021/11/15 15:38
 */
public class SimpleCoffeeFactory {

    /**
     * 简单工厂中创建一个咖啡对象的方法
     * @since 2021/11/15
     * @author wxy
     * @param type 咖啡类型
     * @return com.wxy.design.patterns.creational.factory.simple.Coffee
     **/
    public Coffee createCoffee(String type) {
        Coffee coffee = null;
        if ("american".equals(type)) {
            coffee = new AmericanCoffee();
        } else if ("latter".equals(type)) {
            coffee = new LatteCoffee();
        } else {
            throw new RuntimeException("没有当前类型的咖啡");
        }
        coffee.addMilk();
        coffee.addSugar();
        return coffee;
    }
}
