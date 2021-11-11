package com.wxy.design.patterns.creational.singleton;

/**
 * 对于第一种写法的一个变形
 */
public class Singleton02 {
    private Singleton02() {}

    private static final Singleton02 INSTANCE;

    static {
         INSTANCE = new Singleton02();
    }

    public static Singleton02 getInstance() { return INSTANCE; }
}
