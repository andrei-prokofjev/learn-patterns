package com.apro.patterns.behavioral.memento;

class Originator {

    private String state;

    String getState() {
        return state;
    }

    void setState(String state) {
        this.state = state;
    }

    Memento saveStateToMemento() {
        return new Memento(state);
    }

    void getStateFromMemento(Memento memento) {
        state = memento.getState();
    }
}
