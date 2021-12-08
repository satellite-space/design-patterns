package com.wxy.design.patterns.behavioral.command;

import java.util.ArrayList;
import java.util.List;

/**
 * description: 服务员——执行者/调用者
 *
 * @author wxy
 * @version 1.0
 * @since 2021/12/1 21:45
 */
public class Waiter {

    /**
     * 命令类
     */
    private List<Command> commands = new ArrayList<>();

    /**
     * 设置命令
     * @param command 命令
     */
    public void setCommand(Command command) {
        commands.add(command);
    }

    /**
     * 订单执行
     */
    public void orderUp() {
        System.out.println("订单来了....");
        for (Command command : commands) {
            command.execute();
        }
    }
}
