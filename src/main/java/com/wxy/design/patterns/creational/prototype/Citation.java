package com.wxy.design.patterns.creational.prototype;

/**
 * description: 浅拷贝实现奖状类 <br>
 * date: 2021/11/17 19:20 <br>
 * author: Administrator
 * version: 1.0 <br>
 */
public class Citation implements Cloneable {

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Citation clone() throws CloneNotSupportedException {
        return (Citation) super.clone();
    }

    public void show() {
        System.out.println(name + "同学获得三好学生！");
    }
}
