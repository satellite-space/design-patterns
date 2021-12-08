package com.wxy.design.patterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * description: 具体主题角色
 *
 * @author wxy
 * @version 1.0
 * @since 2021/12/5 12:04
 */
public class SubscriptionSubject implements Subject {

    private List<Observer> observers = new ArrayList<>();

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notify(String msg) {
        for (Observer observer : observers) {
            observer.update(msg);
        }
    }
}
