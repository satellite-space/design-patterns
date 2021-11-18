package com.wxy.design.patterns.creational.build.demo;

/**
 * 学生类客户端
 * @author wxy
 * @version 1.0
 * @since 2021/11/18 16:44
 */
public class Client {
    public static void main(String[] args) {
        Student student = new Student.Builder()
                .name("张三")
                .age(12)
                .address("xxx")
                .sex("男")
                .build();

        System.out.println(student);
    }
}
