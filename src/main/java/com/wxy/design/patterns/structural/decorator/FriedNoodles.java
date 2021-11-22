package com.wxy.design.patterns.structural.decorator;

/**
 * description: 具体构件——炒面
 *
 * @author wxy
 * @version 1.0
 * @since 2021/11/20 19:14
 */
public class FriedNoodles extends FastFood {

    public FriedNoodles() {
        super(12, "炒面");
    }

    public int cost() {
        return getPrice();
    }
}
