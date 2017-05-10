package com.apro.patterns.creational.abstractfactory;

public abstract class AbstractFactory {
    abstract Color getColor(String color);
    abstract Shape getShape(ShapeType type);

    enum ShapeType {
        CIRCLE,
        RECTANGLE,
        SQUARE
    }

}
