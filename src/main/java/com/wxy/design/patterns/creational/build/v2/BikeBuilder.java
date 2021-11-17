package com.wxy.design.patterns.creational.build.v2;

import com.wxy.design.patterns.creational.build.Bike;

/**
 * description: 简化版——抽象建造者类
 *
 * @author wxy
 * @version 1.0
 * @since 2021/11/17 23:01
 */
public abstract class BikeBuilder {

    protected Bike bike = new Bike();

    /**
     * 构建车架
     */
    public abstract void buildFrame();

    /**
     * 构建车座
     */
    public abstract void buildSeat();

    /**
     * 创建自行车
     * @return 自行车实例
     */
    public abstract Bike creatBike();

    /**
     * 指挥者类中的建造方法——将指挥者与建造者的功能结合
     * @return 自行车实例
     */
    public Bike construct() {
        this.buildFrame();
        this.buildSeat();
        return creatBike();
    }
}
