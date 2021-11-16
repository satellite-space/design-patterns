package com.wxy.design.patterns.creational.prototype;

/**
 * description: 原型模式中的抽象原型类 <br>
 * date: 2021/11/16 22:54 <br>
 * author: Administrator
 * version: 1.0 <br>
 */
public class Realizetype implements Cloneable {

    public Integer no = new Integer(22205);

    public Realizetype() {
        System.out.println("原型类实例化...");
    }

    @Override
    protected Realizetype clone() throws CloneNotSupportedException {
        System.out.println("原型类被克隆");
        return (Realizetype) super.clone();
    }
}
