package com.wxy.design.patterns.behavioral.interpreter;

/**
 * description: 加法类——非终结表达式角色
 *
 * @author wxy
 * @version 1.0
 * @since 2021/12/6 21:42
 */
public class Plus extends AbstractExpression {

    /**
     * 左边的表达式
     */
    private AbstractExpression left;

    /**
     * 右边的表达式
     */
    private AbstractExpression right;

    public Plus(AbstractExpression left, AbstractExpression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret(Context context) {
        return left.interpret(context) + right.interpret(context);
    }

    @Override
    public String toString() {
        return String.format("(%s + %s)", left, right);
    }
}
