package com.wxy.spring_demo.controller;

import com.wxy.spring.context.ApplicationContext;
import com.wxy.spring.context.support.ClassPathXmlApplicationContext;
import com.wxy.spring_demo.service.UserService;

/**
 * description: 客户端
 *
 * @author wxy
 * @version 1.0
 * @since 2021/12/12 21:15
 */
public class UserController {
    public static void main(String[] args) throws Exception {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = applicationContext.getBean("userService", UserService.class);
        userService.add();
    }
}
