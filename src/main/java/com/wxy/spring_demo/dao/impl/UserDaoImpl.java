package com.wxy.spring_demo.dao.impl;

import com.wxy.spring_demo.dao.UserDao;

/**
 * description: 数据访问层实现类
 *
 * @author wxy
 * @version 1.0
 * @since 2021/12/12 21:11
 */
public class UserDaoImpl implements UserDao {

    private String username;
    private String password;

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public void add() {
        System.out.println("UserDao...");
        System.out.println("用户名为：" + username + " 密码为：" + password);
    }
}
