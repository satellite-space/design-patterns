package com.wxy.design.patterns.behavioral.strategy;

/**
 * description: 客户端
 *
 * @author wxy
 * @version 1.0
 * @since 2021/11/30 22:34
 */
public class Client {
    public static void main(String[] args) {
        SalesMan salesMan = new SalesMan(new SpringSalesStrategy());
        salesMan.salesManShow();

        salesMan.setStrategy(new MidAutumnSalesStrategy());
        salesMan.salesManShow();

        salesMan.setStrategy(new ChristmasSalesStrategy());
        salesMan.salesManShow();
    }
}
