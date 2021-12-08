package com.wxy.design.patterns.behavioral.command;

import java.util.HashMap;
import java.util.Map;

/**
 * description: 订单类
 *
 * @author wxy
 * @version 1.0
 * @since 2021/12/1 21:37
 */
public class Order {

    /**
     * 餐桌号
     */
    private int diningTable;

    /**
     * 订单
     */
    private Map<String, Integer> foodDic = new HashMap<>();

    public int getDiningTable() {
        return diningTable;
    }

    public void setDiningTable(int diningTable) {
        this.diningTable = diningTable;
    }

    public Map<String, Integer> getFoodDic() {
        return foodDic;
    }

    /**
     * 订单明细
     * @param name 名称
     * @param num 数量
     */
    public void setFood(String name, int num) {
        foodDic.put(name, num);
    }
}
