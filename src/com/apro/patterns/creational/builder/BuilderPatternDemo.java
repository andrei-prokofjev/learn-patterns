package com.apro.patterns.creational.builder;

public class BuilderPatternDemo {

    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();

        Meal meal = mealBuilder.prepareNonVegMeal();
        meal.showItems();
        System.out.println(">>> total cost: " + meal.getCost());
        System.out.println();

        Meal meal1 = mealBuilder.prepareVegMeal();
        meal1.showItems();
        System.out.println(">>> total cost: " + meal1.getCost());

    }
}
