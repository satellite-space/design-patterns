package com.wxy.design.patterns.behavioral.state.after;

/**
 * description: 关闭状态类——具体状态类
 *
 * @author wxy
 * @version 1.0
 * @since 2021/12/2 22:04
 */
public class ClosingState extends LiftState {

    @Override
    public void open() {
        System.out.println("电梯门打开");
        super.context.setLiftState(Context.OPENING_STATE);
        super.context.open();
    }

    @Override
    public void close() {

    }

    @Override
    public void stop() {
        System.out.println("电梯停止运行");
        super.context.setLiftState(Context.STOPPING_STATE);
        super.context.stop();
    }

    @Override
    public void run() {
        System.out.println("电梯运行");
        super.context.setLiftState(Context.RUNNING_STATE);
        super.context.run();
    }
}
