package com.wxy.design.patterns.behavioral.visitor;

/**
 * description: 抽象元素角色（抽象动物类）
 *
 * @author wxy
 * @version 1.0
 * @since 2021/12/5 19:42
 */
public interface Animal {

    /**
     * 动物接受人喂食
     * @param person
     */
    void accept(Person person);
}
