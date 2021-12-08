package com.wxy.design.patterns.behavioral.command;

/**
 * description: 资深厨师——接收者/实现者角色
 *
 * @author wxy
 * @version 1.0
 * @since 2021/12/1 21:40
 */
public class SeniorChef {

    /**
     * 制作食物
     * @param num 数量
     * @param name 名称
     */
    public void makeFood(int num, String name) {
        System.out.println("开始制作" + name + "，数量为：" + num);
    }

}
