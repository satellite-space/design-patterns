package com.wxy.design.patterns.structural.decorator;

/**
 * description: 抽象装饰
 *
 * @author wxy
 * @version 1.0
 * @since 2021/11/20 19:15
 */
public abstract class Garnish extends FastFood {

    /**
     * 被装饰的具体构件类
     */
    private FastFood fastFood;

    public FastFood getFastFood() {
        return fastFood;
    }

    public void setFastFood(FastFood fastFood) {
        this.fastFood = fastFood;
    }

    public Garnish(FastFood fastFood, int price, String desc) {
        super(price, desc);
        this.fastFood = fastFood;
    }
}
