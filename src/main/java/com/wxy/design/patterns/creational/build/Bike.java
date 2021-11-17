package com.wxy.design.patterns.creational.build;

/**
 * description: 产品类 <br>
 * date: 2021/11/17 22:42 <br>
 * author: Administrator
 * version: 1.0 <br>
 */
public class Bike {
    // 车架
    private String frame;
    // 车座
    private String seat;

    public String getFrame() {
        return frame;
    }

    public void setFrame(String frame) {
        this.frame = frame;
    }

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }

    @Override
    public String toString() {
        return "Bike{" +
                "frame='" + frame + '\'' +
                ", seat='" + seat + '\'' +
                '}';
    }
}
