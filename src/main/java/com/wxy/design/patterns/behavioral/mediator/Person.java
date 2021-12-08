package com.wxy.design.patterns.behavioral.mediator;

/**
 * description: 抽象同事类
 *
 * @author wxy
 * @version 1.0
 * @since 2021/12/5 17:35
 */
public abstract class Person {

    /**
     * 同事类用户姓名
     */
    protected String name;

    /**
     * 中介者对象
     */
    protected Mediator mediator;

    public Person(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }
}
