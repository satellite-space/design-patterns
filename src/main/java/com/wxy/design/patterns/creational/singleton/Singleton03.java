package com.wxy.design.patterns.creational.singleton;

/**
 * lazy loading, 也称为懒汉式
 * 虽然达到了按需初始化的目的，但却带来了线程不安全的问题
 */
public class Singleton03 {
    private Singleton03() {}

    private static Singleton03 INSTANCE;

    public static Singleton03 getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Singleton03();
        }
        return INSTANCE;
    }
}
