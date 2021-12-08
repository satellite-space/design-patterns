package com.wxy.design.patterns.behavioral.interpreter;

/**
 * description: 终结符表达式
 *
 * @author wxy
 * @version 1.0
 * @since 2021/12/6 21:51
 */
public class Value extends AbstractExpression {

    private int value;

    public Value(int value) {
        this.value = value;
    }

    @Override
    public int interpret(Context context) {
        return value;
    }

    @Override
    public String toString() {
        return value + "";
    }
}
