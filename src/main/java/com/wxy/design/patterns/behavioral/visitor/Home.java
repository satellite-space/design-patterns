package com.wxy.design.patterns.behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * description: 结构对象类（主人家）
 *
 * @author wxy
 * @version 1.0
 * @since 2021/12/5 19:47
 */
public class Home {

    /**
     * 动物类
     */
    private List<Animal> animals = new ArrayList<>();

    /**
     * 动物接受喂食
     * @param person 喂食的人
     */
    public void action(Person person) {
        for (Animal animal : animals) {
            animal.accept(person);
        }
    }

    /**
     * 添加动物
     * @param animal 动物
     */
    public void add(Animal animal) {
        this.animals.add(animal);
    }

}
