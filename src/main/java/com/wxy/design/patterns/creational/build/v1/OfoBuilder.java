package com.wxy.design.patterns.creational.build.v1;

import com.wxy.design.patterns.creational.build.Bike;

/**
 * description: Ofo单车建造者类
 * @author wxy
 * @version 1.0
 * @since 2021/11/17 22:54
 */
public class OfoBuilder extends BikeBuilder {
    public void buildFrame() {
        bike.setFrame("铝合金车架");
    }

    public void buildSeat() {
        bike.setSeat("橡胶车座");
    }

    public Bike creatBike() {
        return bike;
    }
}
