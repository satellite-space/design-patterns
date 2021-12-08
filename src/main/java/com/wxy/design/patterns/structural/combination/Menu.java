package com.wxy.design.patterns.structural.combination;

import java.util.ArrayList;
import java.util.List;

/**
 * description: 菜单类——树枝节点
 *
 * @author wxy
 * @version 1.0
 * @since 2021/11/22 22:37
 */
public class Menu extends MenuComponent {

    /**
     * 其余子菜单或菜单项
     */
    private List<MenuComponent> menuComponentList = new ArrayList<MenuComponent>();

    public Menu(String name, int level) {
        super(name, level);
    }

    @Override
    public void add(MenuComponent menuComponent) {
        menuComponentList.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        menuComponentList.remove(menuComponent);
    }

    @Override
    public MenuComponent getChild(int index) {
        return menuComponentList.get(index);
    }

    @Override
    public void print() {
        for (int i = 0; i < getLevel(); i++) {
            System.out.print("--");
        }

        System.out.println(getName());

        // 递归调用打印子菜单或菜单项
        for (MenuComponent menuComponent : menuComponentList) {
            menuComponent.print();
        }
    }
}
