package com.wxy.design.patterns.structural.decorator;

/**
 * description: 具体装饰类——培根
 *
 * @author wxy
 * @version 1.0
 * @since 2021/11/20 19:40
 */
public class Bacon extends Garnish {

    public Bacon(FastFood fastFood) {
        super(fastFood, 2, "培根");
    }

    public int cost() {
        return getFastFood().cost() + getPrice();
    }

    public String getDesc() {
        return super.getDesc() + getFastFood().getDesc();
    }
}
