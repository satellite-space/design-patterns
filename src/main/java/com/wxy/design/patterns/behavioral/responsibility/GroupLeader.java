package com.wxy.design.patterns.behavioral.responsibility;

/**
 * description: 小组长——具体处理者
 *
 * @author wxy
 * @version 1.0
 * @since 2021/12/1 22:57
 */
public class GroupLeader extends Handler {
    public GroupLeader() {
        super(0, NUM_ONE);
    }

    @Override
    public void handleLeave(LeaveRequest leave) {
        System.out.println(leave.getName() + "请假" + leave.getNum() + "天，" + leave.getContent());
        System.out.println("同意审批");
    }
}
