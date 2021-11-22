package com.wxy.design.patterns.structural.facade;

/**
 * 客户端类
 *
 * @author wxy
 * @version 1.0
 * @since 2021/11/22 16:35
 */
public class Client {
    public static void main(String[] args) {
        SmartAppliancesFacade appliancesFacade = new SmartAppliancesFacade();
        appliancesFacade.say("打开所有电器");
        appliancesFacade.say("关闭所有电器");
    }
}
