package com.wxy.design.patterns.behavioral.memento.white;

/**
 * description: 角色状态管理者——备忘录管理者
 *
 * @author wxy
 * @version 1.0
 * @since 2021/12/5 22:01
 */
public class RoleStateCaretaker {
    private RoleStateMemento roleStateMemento;

    public RoleStateMemento getRoleStateMemento() {
        return roleStateMemento;
    }

    public void setRoleStateMemento(RoleStateMemento roleStateMemento) {
        this.roleStateMemento = roleStateMemento;
    }
}
