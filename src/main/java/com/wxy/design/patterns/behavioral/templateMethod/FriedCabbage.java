package com.wxy.design.patterns.behavioral.templateMethod;

/**
 * description: 炒包菜——具体子类（模板方法中的具体子类）
 *
 * @author wxy
 * @version 1.0
 * @since 2021/11/29 23:01
 */
public class FriedCabbage extends FiredDish {
    @Override
    public void pourVegetable() {
        System.out.println("倒入包菜");
    }

    @Override
    public void pourSauce() {
        System.out.println("倒入朝天椒");
    }
}
