package com.wxy.spring_demo.service.impl;

import com.wxy.spring_demo.dao.UserDao;
import com.wxy.spring_demo.service.UserService;

/**
 * description: 业务逻辑层实现类
 *
 * @author wxy
 * @version 1.0
 * @since 2021/12/12 21:13
 */
public class UserServiceImpl implements UserService {

    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void add() {
        System.out.println("UserService...");
        userDao.add();
    }
}
