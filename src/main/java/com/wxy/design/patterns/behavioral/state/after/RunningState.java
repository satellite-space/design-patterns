package com.wxy.design.patterns.behavioral.state.after;

/**
 * description: 关闭状态类——具体状态类
 *
 * @author wxy
 * @version 1.0
 * @since 2021/12/2 22:04
 */
public class RunningState extends LiftState {

    @Override
    public void open() {
        System.out.println("电梯处于运行状态，不能开门");
    }

    @Override
    public void close() {
        System.out.println("电梯处于运行状态，门已经关闭");
    }

    @Override
    public void stop() {
        System.out.println("电梯停止运行");
        super.context.setLiftState(Context.STOPPING_STATE);
        super.context.stop();
    }

    @Override
    public void run() {

    }
}
