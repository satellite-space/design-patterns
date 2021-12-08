package com.wxy.design.patterns.behavioral.iterator;

/**
 * description: 实体类
 *
 * @author wxy
 * @version 1.0
 * @since 2021/12/5 18:31
 */
public class Student {

    private String name;
    private int num;

    public Student(String name, int num) {
        this.name = name;
        this.num = num;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", num=" + num +
                '}';
    }
}
