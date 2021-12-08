package com.wxy.design.patterns.behavioral.state.after;

/**
 * description: 客户端类
 *
 * @author wxy
 * @version 1.0
 * @since 2021/12/2 22:19
 */
public class Client {
    public static void main(String[] args) {
        Context context = new Context();
        context.setLiftState(Context.OPENING_STATE);

        context.close();
        context.open();
        context.run();
        context.close();
        context.run();
        context.stop();
        context.open();
    }
}
