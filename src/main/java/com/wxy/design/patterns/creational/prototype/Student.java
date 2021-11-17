package com.wxy.design.patterns.creational.prototype;

import java.io.Serializable;

/**
 * description: 聚合的引用类型变量 <br>
 * date: 2021/11/17 21:35 <br>
 * author: Administrator
 * version: 1.0 <br>
 */
public class Student implements Serializable {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
