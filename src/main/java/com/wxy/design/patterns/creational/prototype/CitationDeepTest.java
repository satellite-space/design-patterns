package com.wxy.design.patterns.creational.prototype;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * description: 深拷贝奖状测试类 <br>
 * date: 2021/11/17 19:21 <br>
 * author: Administrator
 * version: 1.0 <br>
 */
public class CitationDeepTest {
    public static void main(String[] args) throws Exception {
        CitationDeep citation = new CitationDeep();
        Student student = new Student();
        student.setName("张三");
        citation.setStudent(student);

        // 使用对象流的形式实现深拷贝
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("xxx.txt"));
        oos.writeObject(citation);
        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("xxx.txt"));
        CitationDeep citation1 = (CitationDeep) ois.readObject();
        ois.close();

        citation.show();
        citation1.show();
    }
}
