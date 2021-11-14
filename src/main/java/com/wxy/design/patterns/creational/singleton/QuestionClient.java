package com.wxy.design.patterns.creational.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

/**
 * description: 单例破坏 <br>
 * date: 2021/11/14 23:07 <br>
 * author: Administrator
 * version: 1.0 <br>
 */
public class QuestionClient {

    // -------------------------------------序列化----------------------------------------------------------
    /**
     * 将对象写入文件
     * @throws Exception ex
     */
    public static void writeObj2File() throws Exception {
        Singleton06 singleton = Singleton06.getInstance();
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("xxx.txt"));
        oos.writeObject(singleton);
        oos.close();
    }

    /**
     * 从文件中读取对象
     * @throws Exception ex
     */
    public static void readObjFromFile() throws Exception {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("xxx.txt"));
        // 这里读取到的对象，与单例的对象将不一致。单例模式被破坏。
        Singleton06 object = (Singleton06)ois.readObject();
        System.out.println(object == Singleton06.getInstance());
        ois.close();
    }

    // -------------------------------------反射----------------------------------------------------------

    /**
     * 通过反射破坏单例模式
     * @throws Exception ex
     */
    public static void reflectBrokeSingleton() throws Exception {
        Class clazz = Singleton06.class;
        Constructor cons = clazz.getDeclaredConstructor();
        cons.setAccessible(true);
        // 通过此方法获取到的对象与单例的不一致，单例被破坏
        Object instance = cons.newInstance();
        System.out.println(instance == Singleton06.getInstance());
    }
}
