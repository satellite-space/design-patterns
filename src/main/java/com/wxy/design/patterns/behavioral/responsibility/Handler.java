package com.wxy.design.patterns.behavioral.responsibility;

/**
 * description: 处理类——抽象处理者角色
 *
 * @author wxy
 * @version 1.0
 * @since 2021/12/1 22:48
 */
public abstract class Handler {
    // 常数
    protected final static int NUM_ONE = 1;
    protected final static int NUM_THREE = 3;
    protected final static int NUM_SEVEN = 7;

    // 请假天数
    protected int numStart;
    protected int numEnd;

    // 下一个处理者
    protected Handler nextHandler;

    public Handler(int numStart, int numEnd) {
        this.numStart = numStart;
        this.numEnd = numEnd;
    }

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    /**
     * 提交请假条方法
     * @param leave 请假条
     */
    public void submit(LeaveRequest leave) {
        this.handleLeave(leave);
        if (nextHandler == null && leave.getNum() < numEnd) {
            System.out.println("流程审批结束");
        } else {
            System.out.println("提交请假条到一个处理者");
            this.nextHandler.submit(leave);
        }
    }

    /**
     * 处理请假
     * @param leave 请假条
     */
    public abstract void handleLeave(LeaveRequest leave);
}
