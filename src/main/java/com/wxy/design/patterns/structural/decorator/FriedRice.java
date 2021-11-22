package com.wxy.design.patterns.structural.decorator;

/**
 * description: 具体构件——炒饭类
 *
 * @author wxy
 * @version 1.0
 * @since 2021/11/20 19:13
 */
public class FriedRice extends FastFood {

    public FriedRice() {
        super(10, "炒饭类");
    }

    public int cost() {
        return getPrice();
    }
}
