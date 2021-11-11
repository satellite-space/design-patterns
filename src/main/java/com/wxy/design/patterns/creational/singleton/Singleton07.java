package com.wxy.design.patterns.creational.singleton;

/**
 * 枚举的方式。（最完美的方法）
 * 不仅可以解决线程同步，还可以防止反序列化。
 * 因为枚举类是没有构造函数的，无法通过获取class文件，通过classload来生成对象
 */
public enum Singleton07 {
    INSTANCE;

    // 业务方法
    public void m() {}
}
