package com.wxy.design.patterns.behavioral.interpreter;

/**
 * description: 抽象表达式角色类
 *
 * @author wxy
 * @version 1.0
 * @since 2021/12/6 21:40
 */
public abstract class AbstractExpression {
    /**
     * 解释表达式方法
     * @param context 环境角色
     * @return 解释结果
     */
    public abstract int interpret(Context context);
}
