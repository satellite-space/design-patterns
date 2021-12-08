package com.wxy.design.patterns.behavioral.responsibility;

/**
 * description: 总经理——具体处理者
 *
 * @author wxy
 * @version 1.0
 * @since 2021/12/1 22:57
 */
public class GeneralManager extends Handler {
    public GeneralManager() {
        super(NUM_THREE, NUM_SEVEN);
    }

    @Override
    public void handleLeave(LeaveRequest leave) {
        System.out.println(leave.getName() + "请假" + leave.getNum() + "天，" + leave.getContent());
        System.out.println("同意审批");
    }
}
