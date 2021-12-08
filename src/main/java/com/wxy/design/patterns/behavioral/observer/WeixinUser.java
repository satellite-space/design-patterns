package com.wxy.design.patterns.behavioral.observer;

/**
 * description: 具体观察者
 *
 * @author wxy
 * @version 1.0
 * @since 2021/12/5 12:05
 */
public class WeixinUser implements Observer {

    private String name;

    public WeixinUser(String name) {
        this.name = name;
    }

    @Override
    public void update(String msg) {
        System.out.println(name + "收到" + msg);
    }
}
