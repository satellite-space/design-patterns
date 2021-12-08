package com.wxy.design.patterns.behavioral.strategy;

/**
 * description: 销售员——环境类
 *
 * @author wxy
 * @version 1.0
 * @since 2021/11/30 22:32
 */
public class SalesMan {
    /**
     * 销售策略
     */
    private SalesStrategy strategy;

    public SalesMan(SalesStrategy strategy) {
        this.strategy = strategy;
    }

    public SalesStrategy getStrategy() {
        return strategy;
    }

    public void setStrategy(SalesStrategy strategy) {
        this.strategy = strategy;
    }

    /**
     * 销售员展示
     */
    public void salesManShow() {
        strategy.show();
    }
}
