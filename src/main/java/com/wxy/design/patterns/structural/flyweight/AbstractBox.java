package com.wxy.design.patterns.structural.flyweight;

/**
 * description: 抽象享元角色
 *
 * @author wxy
 * @version 1.0
 * @since 2021/11/29 21:48
 */
public abstract class AbstractBox {

    /**
     * 获取具体享元对象
     * 获取具体的图形实例
     * @return 享元对象
     */
    public abstract String getShape();

    /**
     * 打印当前具体图形
     * @param color 颜色
     */
    public void display(String color) {
        System.out.println("图形为： " + getShape() + ", 颜色为： " + color);
    }
}
