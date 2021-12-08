package com.wxy.design.patterns.behavioral.visitor;

/**
 * description: 具体访问者对象（其他人）
 *
 * @author wxy
 * @version 1.0
 * @since 2021/12/5 19:46
 */
public class Someone implements Person {
    @Override
    public void feed(Cat cat) {
        System.out.println("其他人喂食猫咪");
    }

    @Override
    public void feed(Dog dog) {
        System.out.println("其他人喂食狗狗");
    }
}
