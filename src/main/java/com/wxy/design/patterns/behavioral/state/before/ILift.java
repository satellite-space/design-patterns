package com.wxy.design.patterns.behavioral.state.before;

/**
 * description: 电梯类接口
 *
 * @author wxy
 * @version 1.0
 * @since 2021/12/2 21:10
 */
public interface ILift {
    // 电梯状态
    int OPENING_STATE = 1;
    int CLOSING_STATE = 2;
    int RUNNING_STATE = 3;
    int STOPPING_STATE = 4;

    void setState(int state);

    void open();
    void close();
    void stop();
    void run();
}
