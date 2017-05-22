package com.apro.patterns.behavioral.observer;

public class HexObserver extends Observer {

    HexObserver(Subject subject) {
        this.subject = subject;
        subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Hex String: " + Integer.toHexString(subject.getState()));
    }
}
