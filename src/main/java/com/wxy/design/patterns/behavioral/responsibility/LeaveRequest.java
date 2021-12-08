package com.wxy.design.patterns.behavioral.responsibility;

/**
 * description: 请假条
 *
 * @author wxy
 * @version 1.0
 * @since 2021/12/1 22:46
 */
public class LeaveRequest {

    /**
     * 姓名
     */
    private String name;

    /**
     * 请假天数
     */
    private int num;

    /**
     * 请假原因
     */
    private String content;

    public LeaveRequest(String name, int num, String content) {
        this.name = name;
        this.num = num;
        this.content = content;
    }

    public String getName() {
        return name;
    }

    public int getNum() {
        return num;
    }

    public String getContent() {
        return content;
    }
}
