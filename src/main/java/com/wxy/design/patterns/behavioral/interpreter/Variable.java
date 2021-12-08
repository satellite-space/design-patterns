package com.wxy.design.patterns.behavioral.interpreter;

/**
 * description: 变量类
 *
 * @author wxy
 * @version 1.0
 * @since 2021/12/6 21:47
 */
public class Variable extends AbstractExpression {

    /**
     * 变量名
     */
    private String name;

    public Variable(String name) {
        this.name = name;
    }

    @Override
    public int interpret(Context context) {
        return context.getValue(this);
    }

    @Override
    public String toString() {
        return name;
    }
}
