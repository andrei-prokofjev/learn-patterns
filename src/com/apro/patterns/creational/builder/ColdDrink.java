package com.apro.patterns.creational.builder;

public abstract class ColdDrink implements Item {
    @Override
    public Packaging packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
