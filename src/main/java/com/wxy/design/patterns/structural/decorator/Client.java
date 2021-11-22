package com.wxy.design.patterns.structural.decorator;

/**
 * description: 客户端类
 *
 * @author wxy
 * @version 1.0
 * @since 2021/11/20 19:38
 */
public class Client {
    public static void main(String[] args) {
        // 点一份炒饭
        FastFood food = new FriedRice();
        System.out.println(food.getDesc() + "  " + food.cost() + "元");

        // 加一个鸡蛋
        food = new Egg(food);
        System.out.println(food.getDesc() + "  " + food.cost() + "元");

        // 再加个培根
        food = new Bacon(food);
        System.out.println(food.getDesc() + "  " + food.cost() + "元");
    }
}
