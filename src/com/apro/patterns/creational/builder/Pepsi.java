package com.apro.patterns.creational.builder;

public class Pepsi extends ColdDrink {
    @Override
    public String name() {
        return "pepsi";
    }

    @Override
    public float price() {
        return 5.5f;
    }
}
