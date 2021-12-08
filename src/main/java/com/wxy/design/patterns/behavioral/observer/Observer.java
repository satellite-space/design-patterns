package com.wxy.design.patterns.behavioral.observer;

/**
 * description: 抽象观察者角色
 *
 * @author wxy
 * @version 1.0
 * @since 2021/12/5 11:56
 */
public interface Observer {

    /**
     * 观察者更新方法
     * @param msg 消息
     */
    void update(String msg);
}
