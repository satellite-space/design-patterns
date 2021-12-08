package com.wxy.design.patterns.behavioral.observer;

/**
 * description: 客户端
 *
 * @author wxy
 * @version 1.0
 * @since 2021/12/5 12:09
 */
public class Client {
    public static void main(String[] args) {
        WeixinUser user1 = new WeixinUser("用户1");
        WeixinUser user2 = new WeixinUser("用户2");
        WeixinUser user3 = new WeixinUser("用户3");

        Subject subject = new SubscriptionSubject();
        subject.attach(user1);
        subject.attach(user2);
        subject.attach(user3);

        subject.notify("公众号更新了");

        subject.detach(user1);

        subject.notify("公众号下线了");
    }
}
