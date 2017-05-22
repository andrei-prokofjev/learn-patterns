package com.apro.patterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

class Subject {

    private List<Observer> observers = new ArrayList<>();
    private int state;


    int getState() {
        return state;
    }

    void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    void attach(Observer observer) {
        observers.add(observer);
    }

    private void notifyAllObservers() {
        for (Observer o : observers) {
            o.update();
        }
    }
}
