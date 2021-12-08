package com.wxy.design.patterns.behavioral.state.before;

/**
 * description: 客户端
 *
 * @author wxy
 * @version 1.0
 * @since 2021/12/2 21:25
 */
public class Client {
    public static void main(String[] args) {
        Lift lift = new Lift();
        lift.setState(ILift.OPENING_STATE);

        lift.open();
        lift.close();
        lift.run();
        lift.stop();
    }
}
