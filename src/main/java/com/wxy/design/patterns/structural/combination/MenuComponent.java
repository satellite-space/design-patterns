package com.wxy.design.patterns.structural.combination;

/**
 * description: 抽象根节点——菜单抽象类
 *
 * @author wxy
 * @version 1.0
 * @since 2021/11/22 22:32
 */
public abstract class MenuComponent {

    /**
     * 菜单名称
     */
    private String name;

    /**
     * 菜单级别
     */
    private int level;

    public MenuComponent(String name, int level) {
        this.name = name;
        this.level = level;
    }

    /**
     * 进行节点添加
     * @param menuComponent 菜单组件
     */
    public void add(MenuComponent menuComponent) {
        throw new UnsupportedOperationException("当前节点不支持添加操作");
    }

    /**
     * 进行节点移除
     * @param menuComponent 菜单组件
     */
    public void remove(MenuComponent menuComponent) {
        throw new UnsupportedOperationException("当前节点不支持移除操作");
    }

    /**
     * 进行节点查询
     * @param menuComponent 菜单组件
     * @return 查询到的菜单组件
     */
    public MenuComponent getChild(int index) {
        throw new UnsupportedOperationException("当前节点不支持查询操作");
    }

    /**
     * 获取名称
     * @return 名称
     */
    public String getName() {
        return name;
    }

    /**
     * 获取级别
     * @return 级别
     */
    public int getLevel() {
        return level;
    }

    /**
     * 打印操作
     */
    public abstract void print();
}
