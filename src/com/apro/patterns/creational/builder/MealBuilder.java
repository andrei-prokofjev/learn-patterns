package com.apro.patterns.creational.builder;

public class MealBuilder {

    public Meal prepareVegMeal() {
        return new Meal().
                addItem(new VegBurger()).
                addItem(new Coke()).
                addItem(new Pepsi());
    }

    public Meal prepareNonVegMeal() {
        return new Meal().
                addItem(new ChickenBurger()).
                addItem(new Pepsi()).
                addItem(new Pepsi());
    }
}
