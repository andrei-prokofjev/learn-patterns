package com.apro.patterns.creational.builder;

public class VegBurger extends Burger {
    @Override
    public String name() {
        return "veg burger";
    }

    @Override
    public float price() {
        return 25f;
    }
}
