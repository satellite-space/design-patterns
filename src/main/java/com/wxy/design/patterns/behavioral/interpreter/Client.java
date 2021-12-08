package com.wxy.design.patterns.behavioral.interpreter;

/**
 * description: 客户端类
 *
 * @author wxy
 * @version 1.0
 * @since 2021/12/6 21:53
 */
public class Client {
    public static void main(String[] args) {
        Context context = new Context();
        Variable a = new Variable("a");
        Variable b = new Variable("b");
        Variable c = new Variable("c");
        Variable d = new Variable("d");

        context.assign(a, 1);
        context.assign(b, 2);
        context.assign(c, 3);
        context.assign(d, 4);

        AbstractExpression expression = new Plus(new Minus(new Minus(new Plus(a, c), b), d), a);
        int result = expression.interpret(context);
        System.out.println("expression: " + expression + ".result: " + result);
    }
}
