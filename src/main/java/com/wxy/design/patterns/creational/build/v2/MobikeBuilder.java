package com.wxy.design.patterns.creational.build.v2;

import com.wxy.design.patterns.creational.build.Bike;

/**
 * description: 摩拜单车建造者类
 * @author wxy
 * @version 1.0
 * @since 2021/11/17 22:50
 */
public class MobikeBuilder extends BikeBuilder {
    public void buildFrame() {
        bike.setFrame("碳纤维车架");
    }

    public void buildSeat() {
        bike.setSeat("真皮车座");
    }

    public Bike creatBike() {
        return bike;
    }
}
