package com.wxy.design.patterns.behavioral.mediator;

/**
 * description: 房东——具体同事类
 *
 * @author wxy
 * @version 1.0
 * @since 2021/12/5 17:46
 */
public class HouseOwner extends Person {
    public HouseOwner(String name, Mediator mediator) {
        super(name, mediator);
    }

    /**
     * 与中介者对象建立连接
     * @param msg 消息
     */
    public void contact(String msg) {
        mediator.contact(msg, this);
    }

    /**
     * 获取信息
     * @param msg 获取到的信息
     */
    public void getMessage(String msg) {
        System.out.println("房东" + name + "获取到的信息为：" + msg);
    }
}
