package com.wxy.design.patterns.creational.singleton;

/**
 * 饿汉式：静态成员变量
 *      类一加载，就在内存中生成一个实例。由JVM保证其线程安全，JVM只会将这个类在内存中加载一次
 * 缺点：不管使用与否，都会生成实例。
 */
public class Singleton01 {
    // 1.私有构造方法
    private Singleton01() {}

    // 2.在本类中创建本类的对象
    private static final Singleton01 INSTANCE = new Singleton01();

    // 3.提供一个公共的访问方式，让外界获取该对象
    public static Singleton01 getInstance() { return INSTANCE; }
}
