package com.wxy.design.patterns.behavioral.visitor;

/**
 * description: 抽象访问者类（喂食动物的人）
 *
 * @author wxy
 * @version 1.0
 * @since 2021/12/5 19:43
 */
public interface Person {

    /**
     * 喂食猫
     * @param cat
     */
    void feed(Cat cat);

    /**
     * 喂食狗
     * @param dog
     */
    void feed(Dog dog);
}
