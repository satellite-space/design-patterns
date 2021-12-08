package com.wxy.design.patterns.behavioral.state.after;

/**
 * description: 停止状态类——具体状态类
 *
 * @author wxy
 * @version 1.0
 * @since 2021/12/2 22:04
 */
public class StoppingState extends LiftState {

    @Override
    public void open() {
        System.out.println("电梯门打开");
        super.context.setLiftState(Context.OPENING_STATE);
        super.context.open();
    }

    @Override
    public void close() {
        System.out.println("电梯门关闭");
        super.context.setLiftState(Context.CLOSING_STATE);
        super.context.close();
    }

    @Override
    public void stop() {

    }

    @Override
    public void run() {
        System.out.println("电梯运行");
        super.context.setLiftState(Context.RUNNING_STATE);
        super.context.run();
    }
}
