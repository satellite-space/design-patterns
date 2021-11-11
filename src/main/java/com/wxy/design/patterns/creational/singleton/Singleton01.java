package com.wxy.design.patterns.creational.singleton;

/**
 * 饿汉式：类一加载，就在内存中生成一个实例。由JVM保证其线程安全，JVM只会将这个类在内存中加载一次
 * 缺点：不管使用与否，都会生成实例。
 */
public class Singleton01 {
    private Singleton01() {}

    private static final Singleton01 INSTANCE = new Singleton01();

    public static Singleton01 getInstance() { return INSTANCE; }
}
