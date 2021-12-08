package com.wxy.design.patterns.structural.combination;

/**
 * description: 客户端类
 *
 * @author wxy
 * @version 1.0
 * @since 2021/11/22 22:45
 */
public class Client {
    public static void main(String[] args) {
        MenuComponent menu1 = new Menu("菜单管理", 2);
        menu1.add(new MenuItem("页面访问", 3));
        menu1.add(new MenuItem("展开菜单", 3));
        menu1.add(new MenuItem("编辑菜单", 3));
        menu1.add(new MenuItem("删除菜单", 3));
        menu1.add(new MenuItem("新增菜单", 3));

        MenuComponent menu2 = new Menu("权限配置", 2);
        menu2.add(new MenuItem("页面访问", 3));
        menu2.add(new MenuItem("提交保存", 3));

        MenuComponent menu3 = new Menu("角色管理", 2);
        menu3.add(new MenuItem("页面访问", 3));
        menu3.add(new MenuItem("新增角色", 3));
        menu3.add(new MenuItem("修改角色", 3));

        MenuComponent root = new Menu("系统管理", 1);
        root.add(menu1);
        root.add(menu2);
        root.add(menu3);

        root.print();

        // 异常测试
        MenuItem menuItem = new MenuItem("", 5);
        menuItem.add(menu1);
    }
}
