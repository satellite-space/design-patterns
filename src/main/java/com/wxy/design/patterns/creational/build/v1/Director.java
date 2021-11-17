package com.wxy.design.patterns.creational.build.v1;

import com.wxy.design.patterns.creational.build.Bike;

/**
 * description: 指挥者类
 *
 * @author wxy
 * @version 1.0
 * @since 2021/11/17 22:56
 */
public class Director {

    private BikeBuilder builder;

    public Director(BikeBuilder builder) {
        this.builder = builder;
    }

    /**
     * 构造方法
     * @return 自行车实例
     */
    public Bike construct() {
        builder.buildFrame();
        builder.buildSeat();
        return builder.creatBike();
    }

}
