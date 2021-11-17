package com.wxy.design.patterns.creational.prototype;

import java.io.Serializable;

/**
 * description: 奖状类深拷贝 <br>
 * date: 2021/11/17 21:41 <br>
 * author: Administrator
 * version: 1.0 <br>
 */
public class CitationDeep implements Cloneable, Serializable {
    private Student student;

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public CitationDeep clone() throws CloneNotSupportedException {
        return (CitationDeep) super.clone();
    }

    public void show() {
        System.out.println(student.getName() + "同学获得三好学生奖状！");
    }
}
