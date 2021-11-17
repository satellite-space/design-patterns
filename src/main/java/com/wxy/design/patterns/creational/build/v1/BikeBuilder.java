package com.wxy.design.patterns.creational.build.v1;

import com.wxy.design.patterns.creational.build.Bike;

/**
 * 抽象建造者类
 * @author Administrator
 * @version 1.0
 * @since 2021/11/17 22:47
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

}
