package com.wxy.design.patterns.behavioral.templateMethod;

/**
 * description: 炒菜类——抽象类（模板方法中的抽象类）
 *
 * @author wxy
 * @version 1.0
 * @since 2021/11/29 23:02
 */
public abstract class FiredDish {

    public final void cookProcess() {
        pourOil();
        heatOil();
        pourVegetable();
        pourSauce();
        fry();
    }

    /**
     * 基本方法——倒油
     */
    public void pourOil() {
        System.out.println("倒油");
    }

    /**
     * 基本方法——热油
     */
    public void heatOil() {
        System.out.println("热油");
    }

    /**
     * 倒蔬菜——具体方法
     */
    public abstract void pourVegetable();

    /**
     * 倒调料——具体方法
     */
    public abstract void pourSauce();

    /**
     * 基本方法——翻炒
     */
    public void fry() {
        System.out.println("翻炒");
    }
}
