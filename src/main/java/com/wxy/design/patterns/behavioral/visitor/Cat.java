package com.wxy.design.patterns.behavioral.visitor;

/**
 * description: 具体元素类（猫咪）
 *
 * @author wxy
 * @version 1.0
 * @since 2021/12/5 19:44
 */
public class Cat implements Animal {
    @Override
    public void accept(Person person) {
        person.feed(this);
        System.out.println("猫咪被喂食");
    }
}
