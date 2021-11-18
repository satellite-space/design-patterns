package com.wxy.design.patterns.creational.build.demo;

/**
 * 使用建造者模式重构的学生类
 * @author wxy
 * @version 1.0
 * @since 2021/11/18 16:36
 */
public class Student {
    private String name;
    private String address;
    private int age;
    private String sex;

    private Student(Builder builder) {
        this.name = builder.name;
        this.address = builder.address;
        this.age = builder.age;
        this.sex = builder.sex;
    }

    /**
     * 建造者模式内部类
     */
    public static final class Builder {
        private String name;
        private String address;
        private int age;
        private String sex;

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder address(String address) {
            this.address = address;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder sex(String sex) {
            this.sex = sex;
            return this;
        }

        public Student build() {
            return new Student(this);
        }
    }
}
