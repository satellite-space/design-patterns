package com.wxy.design.patterns.creational.singleton;

/**
 * lazy loading, 也称为懒汉式
 * 虽然达到了按需初始化的目的，但却带来了线程不安全的问题
 * 加锁可以解决，但是效率会下降，在此基础上增加了双重校验来提高效率
 */
public class Singleton05 {
    private Singleton05() {}

    private static volatile Singleton05 INSTANCE;

    public static Singleton05 getInstance() {
        if (INSTANCE == null) {
            synchronized (Singleton05.class) {
                if (INSTANCE == null) {
                    INSTANCE = new Singleton05();
                }
            }
        }
        return INSTANCE;
    }
}
