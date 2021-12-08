package com.wxy.design.patterns.behavioral.templateMethod;

/**
 * description: 炒菜心——具体子类（模板方法中的具体子类）
 *
 * @author wxy
 * @version 1.0
 * @since 2021/11/29 23:09
 */
public class FriedVegetable extends FiredDish {
    @Override
    public void pourVegetable() {
        System.out.println("倒入菜心");
    }

    @Override
    public void pourSauce() {
        System.out.println("倒入蒜蓉");
    }
}
