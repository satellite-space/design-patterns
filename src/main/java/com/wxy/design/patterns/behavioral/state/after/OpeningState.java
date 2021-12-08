package com.wxy.design.patterns.behavioral.state.after;

/**
 * description: 开启状态类——具体状态类
 *
 * @author wxy
 * @version 1.0
 * @since 2021/12/2 22:04
 */
public class OpeningState extends LiftState {

    @Override
    public void open() {
        System.out.println("电梯门已经打开");
    }

    @Override
    public void close() {
        System.out.println("电梯门关闭");
        super.context.setLiftState(Context.CLOSING_STATE);
        super.context.close();
    }

    @Override
    public void stop() {
        System.out.println("电梯处于停止状态");
    }

    @Override
    public void run() {
        System.out.println("电梯门未关闭，不能运行");
    }
}
