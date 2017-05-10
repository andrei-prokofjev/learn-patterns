package com.apro.patterns.creational.builder;

public class Coke extends ColdDrink {
    @Override
    public String name() {
        return "coke";
    }

    @Override
    public float price() {
        return 5f;
    }
}
