package com.wxy.design.patterns.behavioral.templateMethod;

/**
 * description: 客户端类
 *
 * @author wxy
 * @version 1.0
 * @since 2021/11/29 23:10
 */
public class Client {
    public static void main(String[] args) {
        FriedCabbage friedCabbage = new FriedCabbage();
        friedCabbage.cookProcess();
    }
}
