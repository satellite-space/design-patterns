package com.wxy.design.patterns.behavioral.strategy;

import java.util.Comparator;

public class Cat implements Comparable<Cat> {

    private int weight;

    private int age;

    public Cat(int weight, int age){
        this.weight = weight;
        this.age = age;
    }

    public int compareTo(Cat o) {
        if (this.age < o.age) return -1;
        else if (this.age == o.age) return 0;
        else return 1;
    }
}
