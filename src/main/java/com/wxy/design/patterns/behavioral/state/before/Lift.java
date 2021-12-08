package com.wxy.design.patterns.behavioral.state.before;

/**
 * description: 电梯类
 *
 * @author wxy
 * @version 1.0
 * @since 2021/12/2 21:15
 */
public class Lift implements ILift {

    private int state;

    @Override
    public void setState(int state) {
        this.state = state;
    }

    @Override
    public void open() {
        switch (state) {
            case OPENING_STATE:
                break;
            case RUNNING_STATE:
                System.out.println("正在运行，不能打开门");
                break;
            case CLOSING_STATE:
            case STOPPING_STATE:
                System.out.println("打开门");
                setState(OPENING_STATE);
        }
    }

    @Override
    public void close() {
        switch (state) {
            case OPENING_STATE:
                System.out.println("关闭门");
                setState(CLOSING_STATE);
                break;
            case RUNNING_STATE:
            case CLOSING_STATE:
            case STOPPING_STATE:
                System.out.println("门已关闭");
                break;
        }
    }

    @Override
    public void stop() {
        // 省略
    }

    @Override
    public void run() {
        // 省略
    }
}
