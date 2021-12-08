package com.wxy.design.patterns.behavioral.memento.white;

/**
 * description: 角色状态备忘录——备忘录角色
 *
 * @author wxy
 * @version 1.0
 * @since 2021/12/5 21:53
 */
public class RoleStateMemento {

    // 血量
    private int vit;
    // 攻击力
    private int atk;
    // 防御力
    private int def;

    public RoleStateMemento(int vit, int atk, int def) {
        this.vit = vit;
        this.atk = atk;
        this.def = def;
    }

    public int getVit() {
        return vit;
    }

    public void setVit(int vit) {
        this.vit = vit;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }
}
