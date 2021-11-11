package com.wxy.design.patterns.creational.singleton;

/**
 * lazy loading, 也称为懒汉式
 * 虽然达到了按需初始化的目的，但却带来了线程不安全的问题
 * 加锁可以解决，但是效率会下降
 */
public class Singleton04 {
    private Singleton04() {}

    private static Singleton04 INSTANCE;

    public static synchronized Singleton04 getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Singleton04();
        }
        return INSTANCE;
    }
}
