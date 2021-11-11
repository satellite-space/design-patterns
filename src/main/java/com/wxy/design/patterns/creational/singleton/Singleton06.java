package com.wxy.design.patterns.creational.singleton;

/**
 * 静态内部类方式
 * JVM保证单例
 * 加载外部类时不会加载内部类，这样可以实现懒加载
 */
public class Singleton06 {
    private Singleton06() {}

    private static class SingleHolder {
        private static final Singleton06 INSTANCE = new Singleton06();
    }

    public static Singleton06 getInstance() {
        return SingleHolder.INSTANCE;
    }
}
