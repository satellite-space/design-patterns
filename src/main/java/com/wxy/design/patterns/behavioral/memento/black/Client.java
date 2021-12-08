package com.wxy.design.patterns.behavioral.memento.black;

/**
 * description: 客户端
 *
 * @author wxy
 * @version 1.0
 * @since 2021/12/5 22:17
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("————————————————————战斗开始前————————————————————");
        GameRole gameRole = new GameRole();
        gameRole.initState();
        gameRole.display();
        RoleStateCaretaker roleStateCaretaker = new RoleStateCaretaker();
        roleStateCaretaker.setMemento(gameRole.saveState());

        System.out.println("————————————————————战斗开始后————————————————————");
        gameRole.fight();
        gameRole.display();

        System.out.println("————————————————————状态重置前————————————————————");
        gameRole.recoverState(roleStateCaretaker.getMemento());
        gameRole.display();
    }
}
