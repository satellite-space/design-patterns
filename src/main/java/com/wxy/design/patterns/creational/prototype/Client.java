package com.wxy.design.patterns.creational.prototype;

/**
 * description: 原型模式浅克隆客户端 <br>
 * date: 2021/11/16 22:56 <br>
 * author: Administrator
 * version: 1.0 <br>
 */
public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        Realizetype realizetype = new Realizetype();
        Realizetype clone = realizetype.clone();
        // 原型类与克隆类的地址不一样
        System.out.println(realizetype == clone);
        // 原型类中属性与克隆类中的属性地址一样
        System.out.println(new Integer(22205) == new Integer(22205));
        System.out.println(realizetype.no == clone.no);
    }
}
