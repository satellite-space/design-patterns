package com.wxy.design.patterns.behavioral.mediator;

/**
 * description: 抽象中介者角色
 *
 * @author wxy
 * @version 1.0
 * @since 2021/12/5 17:33
 */
public abstract class Mediator {
    /**
     * 连接同事类方法
     * @param msg 消息
     * @param person 同事类
     */
    public abstract void contact(String msg, Person person);
}
