package com.wxy.design.patterns.structural.facade;

/**
 * 智能音箱——门面类
 *
 * @author wxy
 * @version 1.0
 * @since 2021/11/22 16:31
 */
public class SmartAppliancesFacade {

    // 聚合空调、类、电视等成员
    private AriCondition ariCondition;
    private Light light;
    private TV tv;

    public SmartAppliancesFacade(){
        this.ariCondition = new AriCondition();
        this.tv = new TV();
        this.light = new Light();
    }

    public void say(String message) {
        if (message.contains("打开")) {
            on();
        } else if (message.contains("关闭")) {
            off();
        } else {
            System.out.println("暂时不支持这个功能！");
        }
    }

    private void on() {
        ariCondition.on();
        light.on();
        tv.on();
    }

    private void off() {
        ariCondition.off();
        light.off();
        tv.off();
    }
}
