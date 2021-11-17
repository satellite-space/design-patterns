package com.wxy.design.patterns.creational.prototype;

/**
 * description: 浅拷贝奖状测试类 <br>
 * date: 2021/11/17 19:21 <br>
 * author: Administrator
 * version: 1.0 <br>
 */
public class CitationTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Citation citation = new Citation();
        Citation citation1 = citation.clone();

        citation.setName("张三");
        citation1.setName("李四");

        citation.show();
        citation1.show();
    }
}
