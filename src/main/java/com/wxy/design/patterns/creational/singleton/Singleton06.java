package com.wxy.design.patterns.creational.singleton;

import java.io.Serializable;

/**
 * 静态内部类方式
 * JVM保证单例
 * 加载外部类时不会加载内部类，这样可以实现懒加载
 */
public class Singleton06 implements Serializable {
    // 用于标记是否为第一次加载创建单例对象，用于解决反射破坏单例的问题
    private static boolean flag = false;

    private Singleton06() {
        synchronized (Singleton06.class) {
            if (flag) {
                throw new RuntimeException("当前单例类不是第一次被加载");
            }
            flag = true;
        }
    }

    private static class SingleHolder {
        private static final Singleton06 INSTANCE = new Singleton06();
    }

    public static Singleton06 getInstance() {
        return SingleHolder.INSTANCE;
    }

    /**
     * 该方法用于避免当前单例类被序列化时，在内存中重新生成对象的问题。
     * 有此方法时，会在内存中返回该实例，没有则会new一个新的对象。
     * @return 当前实例
     */
    public Object readResolve() {
        return SingleHolder.INSTANCE;
    }
}
