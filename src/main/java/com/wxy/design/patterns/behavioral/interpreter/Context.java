package com.wxy.design.patterns.behavioral.interpreter;

import java.util.HashMap;
import java.util.Map;

/**
 * description: 环境角色类
 *
 * @author wxy
 * @version 1.0
 * @since 2021/12/6 21:42
 */
public class Context {

    private Map<Variable, Value> map = new HashMap<>();

    /**
     * 添加要解析的元素
     * @param variable 变量
     * @param value 值
     */
    public void assign(Variable variable, Integer value) {
        map.put(variable, new Value(value));
    }

    /**
     * 获取变量的值
     * @param var 变量
     * @return 对应的值
     */
    public int getValue(Variable var) {
        return map.get(var).interpret(this);
    }

}
