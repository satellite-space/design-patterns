package com.wxy.design.patterns.behavioral.command;

import java.util.Map;

/**
 * description: 订单命令——具体命令角色
 *
 * @author wxy
 * @version 1.0
 * @since 2021/12/1 21:43
 */
public class OrderCommand implements Command {

    /**
     * 资源厨师——接收者
     */
    private SeniorChef seniorChef;

    /**
     * 订单
     */
    private Order order;

    public OrderCommand(SeniorChef seniorChef, Order order) {
        this.seniorChef = seniorChef;
        this.order = order;
    }

    @Override
    public void execute() {
        int diningTable = order.getDiningTable();
        System.out.println("开始制作" + diningTable + "的订单。");
        Map<String, Integer> foodDic = order.getFoodDic();
        foodDic.forEach((food, num) -> seniorChef.makeFood(num, food));
    }
}
