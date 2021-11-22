package com.wxy.design.patterns.structural.decorator;

/**
 * description: 抽象构件——快餐店抽象类
 *
 * @author wxy
 * @version 1.0
 * @since 2021/11/20 19:08
 */
public abstract class FastFood {

    /**
     * 价格
     */
    private int price;

    /**
     * 描述
     */
    private String desc;

    public FastFood(int price, String desc) {
        this.price = price;
        this.desc = desc;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    /**
     * 计算总价
     * @return 总价
     */
    public abstract int cost();
}
