package com.wxy.design.patterns.behavioral.memento.white;

/**
 * description: 游戏角色——发起人角色
 *
 * @author wxy
 * @version 1.0
 * @since 2021/12/5 21:56
 */
public class GameRole {

    // 血量
    private int vit;
    // 攻击力
    private int atk;
    // 防御力
    private int def;

    /**
     * 初始化状态
     */
    public void initState() {
        this.atk = 100;
        this.vit = 100;
        this.def = 100;
    }

    /**
     * 展示状态
     */
    public void display() {
        System.out.println("角色血量为：" + vit);
        System.out.println("角色攻击力为：" + atk);
        System.out.println("角色防御力为：" + def);
    }

    /**
     * 战斗后状态更新
     */
    public void fight() {
        this.vit = 0;
        this.atk = 50;
        this.def = 50;
    }

    /**
     * 保存当前状态
     * @return 备忘录对象
     */
    public RoleStateMemento saveState() {
        return new RoleStateMemento(vit, atk, def);
    }

    /**
     * 恢复状态到存储的记录上
     * @param memento 备忘录存档
     */
    public void recoverState(RoleStateMemento memento) {
        this.vit = memento.getVit();
        this.atk = memento.getAtk();
        this.def = memento.getDef();
    }
}
