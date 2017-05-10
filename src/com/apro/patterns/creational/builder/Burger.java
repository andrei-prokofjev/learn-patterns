package com.apro.patterns.creational.builder;

public abstract class Burger implements Item {

    @Override
    public Packaging packing() {
        return new Wrapper();
    }

    public abstract float price();
}
