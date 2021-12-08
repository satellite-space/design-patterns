package com.wxy.design.patterns.behavioral.state.after;

/**
 * description: 电梯状态抽象类——抽象状态角色
 *
 * @author wxy
 * @version 1.0
 * @since 2021/12/2 22:01
 */
public abstract class LiftState {

    /**
     * 环境角色
     */
    protected Context context;

    /**
     * set方法
     * @param context 上下文
     */
    public void setContext(Context context) {
        this.context = context;
    }

    /**
     * 打开电梯方法
     */
    public abstract void open();

    /**
     * 关闭电梯
     */
    public abstract void close();

    /**
     * 停止电梯
     */
    public abstract void stop();

    /**
     * 运行电梯
     */
    public abstract void run();
}
