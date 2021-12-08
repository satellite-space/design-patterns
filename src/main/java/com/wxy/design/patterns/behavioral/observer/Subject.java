package com.wxy.design.patterns.behavioral.observer;

/**
 * description: 抽象主题
 *
 * @author wxy
 * @version 1.0
 * @since 2021/12/5 11:58
 */
public interface Subject {

    /**
     * 添加观察者
     * @param observer 观察者
     */
    void attach(Observer observer);

    /**
     * 删除观察者
     * @param observer 观察者
     */
    void detach(Observer observer);

    /**
     * 唤醒观察者
     * @param msg 消息
     */
    void notify(String msg);
}
