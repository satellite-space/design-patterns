package com.wxy.design.patterns.behavioral.strategy;

/**
 * description: 圣诞节销售策略——具体策略类
 *
 * @author wxy
 * @version 1.0
 * @since 2021/11/30 22:29
 */
public class ChristmasSalesStrategy extends SalesStrategy {
    @Override
    public void show() {
        System.out.println("圣诞节促销全场95折");
    }
}
