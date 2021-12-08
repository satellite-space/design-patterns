package com.wxy.design.patterns.behavioral.responsibility;

/**
 * description: 客户端类
 *
 * @author wxy
 * @version 1.0
 * @since 2021/12/1 23:01
 */
public class Client {
    public static void main(String[] args) {
        LeaveRequest leaveRequest = new LeaveRequest("小李", 5, "休假");

        GroupLeader groupLeader = new GroupLeader();
        Manager manager = new Manager();
        GeneralManager generalManager = new GeneralManager();

        groupLeader.setNextHandler(manager);
        manager.setNextHandler(generalManager);

        groupLeader.submit(leaveRequest);
    }
}
