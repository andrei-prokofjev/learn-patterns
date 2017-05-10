package com.apro.patterns.creational.builder;

public class ChickenBurger extends Burger {
    @Override
    public String name() {
        return "chicken burger";
    }

    @Override
    public float price() {
        return 30f;
    }
}
