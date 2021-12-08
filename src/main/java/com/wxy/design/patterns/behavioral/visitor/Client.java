package com.wxy.design.patterns.behavioral.visitor;

/**
 * description: 客户端
 *
 * @author wxy
 * @version 1.0
 * @since 2021/12/5 19:50
 */
public class Client {
    public static void main(String[] args) {
        Home home = new Home();
        Cat cat = new Cat();
        Dog dog = new Dog();
        home.add(cat);
        home.add(dog);

        Owner owner = new Owner();
        home.action(owner);

        Someone someone = new Someone();
        home.action(someone);
    }
}
