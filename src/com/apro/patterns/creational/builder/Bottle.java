package com.apro.patterns.creational.builder;

class Bottle implements Packaging {
    @Override
    public String pack() {
        return "bottle";
    }
}
