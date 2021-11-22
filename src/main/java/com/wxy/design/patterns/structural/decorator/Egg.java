package com.wxy.design.patterns.structural.decorator;

/**
 * description: 具体装饰类——鸡蛋
 *
 * @author wxy
 * @version 1.0
 * @since 2021/11/20 19:28
 */
public class Egg extends Garnish {

    public Egg(FastFood fastFood) {
        super(fastFood, 1, "鸡蛋");
    }

    public int cost() {
        return getFastFood().cost() + getPrice();
    }

    public String getDesc() {
        return super.getDesc() + getFastFood().getDesc();
    }
}
