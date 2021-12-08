package com.wxy.design.patterns.behavioral.command;

/**
 * description: 客户端类
 *
 * @author wxy
 * @version 1.0
 * @since 2021/12/1 21:52
 */
public class Client {
    public static void main(String[] args) {
        Order order1 = new Order();
        order1.setDiningTable(1);
        order1.setFood("油沷面", 1);
        order1.setFood("冰峰", 1);

        Order order2 = new Order();
        order2.setDiningTable(2);
        order2.setFood("牛肉炒拉条", 1);

        SeniorChef seniorChef = new SeniorChef();
        OrderCommand cmd1 = new OrderCommand(seniorChef, order1);
        OrderCommand cmd2 = new OrderCommand(seniorChef, order2);

        Waiter invoke = new Waiter();
        invoke.setCommand(cmd1);
        invoke.setCommand(cmd2);
        invoke.orderUp();
    }
}
