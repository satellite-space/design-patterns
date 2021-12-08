package com.wxy.design.patterns.structural.combination;

/**
 * description: 菜单项
 *
 * @author wxy
 * @version 1.0
 * @since 2021/11/22 22:43
 */
public class MenuItem extends MenuComponent {

    public MenuItem(String name, int level) {
        super(name, level);
    }

    public void print() {
        for (int i = 0; i < getLevel(); i++) {
            System.out.print("--");
        }
        System.out.println(getName());
    }
}
