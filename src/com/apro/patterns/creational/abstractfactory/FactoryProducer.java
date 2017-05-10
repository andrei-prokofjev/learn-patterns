package com.apro.patterns.creational.abstractfactory;

public class FactoryProducer {

    public static AbstractFactory getFactory(String choice) {
        if (choice.equalsIgnoreCase("shape")) {
            return new ShapeFactory();
        }

        if (choice.equalsIgnoreCase("color")) {
            return new ColorFactory();
        }

        return null;
    }
}
