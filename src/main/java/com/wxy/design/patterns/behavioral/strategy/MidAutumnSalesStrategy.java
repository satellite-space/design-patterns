package com.wxy.design.patterns.behavioral.strategy;

/**
 * description: 中秋节销售策略——具体策略类
 *
 * @author wxy
 * @version 1.0
 * @since 2021/11/30 22:28
 */
public class MidAutumnSalesStrategy extends SalesStrategy {
    @Override
    public void show() {
        System.out.println("中秋节月饼买一送一");
    }
}
