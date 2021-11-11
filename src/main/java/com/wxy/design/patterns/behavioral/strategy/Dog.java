package com.wxy.design.patterns.behavioral.strategy;

public class Dog implements Comparable<Dog> {

    private int food;

    public Dog(int food) {
        this.food = food;
    }

    public int compareTo(Dog o) {
        if (this.food < o.food) return -1;
        else if (this.food == o.food) return 0;
        else return 1;
    }
}
