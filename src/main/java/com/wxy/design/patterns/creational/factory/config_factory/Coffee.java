package com.wxy.design.patterns.creational.factory.config_factory;

/**
 * 抽象的咖啡类
 */
public abstract class Coffee {
    /**
     * 添加牛奶的方法
     */
    public void addMilk() {
        System.out.println("添加牛奶");
    }

    /**
     * 添加糖的方法
     */
    public void addSugar() {
        System.out.println("添加方糖");
    }

    /**
     * 获取咖啡的名字
     * @return
     */
    public abstract String getName();
}
