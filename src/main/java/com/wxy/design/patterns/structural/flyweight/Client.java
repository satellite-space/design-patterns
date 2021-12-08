package com.wxy.design.patterns.structural.flyweight;

/**
 * description: 客户对象类
 *
 * @author wxy
 * @version 1.0
 * @since 2021/11/29 21:58
 */
public class Client {
    public static void main(String[] args) {
        AbstractBox box1 = BoxFactory.getInstance().getBox("I");
        box1.display("red");

        AbstractBox box2 = BoxFactory.getInstance().getBox("L");
        box1.display("yellow");

        AbstractBox box3 = BoxFactory.getInstance().getBox("O");
        box1.display("gray");

        AbstractBox box4 = BoxFactory.getInstance().getBox("O");
        box1.display("blue");

        System.out.println("O型盒子是否为同一个对象: " + (box3 == box4));
    }
}
