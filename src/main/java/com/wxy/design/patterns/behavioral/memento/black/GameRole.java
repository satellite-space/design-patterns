package com.wxy.design.patterns.behavioral.memento.black;

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
    public Memento saveState() {
        return new RoleStateMemento(vit, atk, def);
    }

    /**
     * 恢复状态到存储的记录上
     * @param memento 备忘录存档
     */
    public void recoverState(Memento memento) {
        RoleStateMemento roleStateMemento = (RoleStateMemento) memento;
        this.vit = roleStateMemento.getVit();
        this.atk = roleStateMemento.getAtk();
        this.def = roleStateMemento.getDef();
    }

    private static class RoleStateMemento implements Memento {
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
}
