package com.wxy.design.patterns.behavioral.state.after;

/**
 * description: 上下文环境类——环境角色
 *
 * @author wxy
 * @version 1.0
 * @since 2021/12/2 22:01
 */
public class Context {

    /**
     * 开启状态
     */
    public static final OpeningState OPENING_STATE = new OpeningState();

    /**
     * 关闭状态
     */
    public static final ClosingState CLOSING_STATE = new ClosingState();

    /**
     * 停止状态
     */
    public static final StoppingState STOPPING_STATE = new StoppingState();

    /**
     * 运行状态
     */
    public static final RunningState RUNNING_STATE = new RunningState();

    private LiftState liftState;

    public LiftState getLiftState() {
        return liftState;
    }

    public void setLiftState(LiftState liftState) {
        liftState.setContext(this);
        this.liftState = liftState;
    }

    public void open() {
        this.liftState.open();
    }

    public void close() {
        this.liftState.close();
    }

    public void stop() {
        this.liftState.stop();
    }

    public void run() {
        this.liftState.run();
    }
}
