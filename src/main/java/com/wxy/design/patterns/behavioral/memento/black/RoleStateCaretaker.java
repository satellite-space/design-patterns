package com.wxy.design.patterns.behavioral.memento.black;

/**
 * description: 角色状态管理者——备忘录管理者
 *
 * @author wxy
 * @version 1.0
 * @since 2021/12/5 22:01
 */
public class RoleStateCaretaker {
    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
