package com.apro.patterns.creational.factory;

public class ShapeFactory {

    public Shape getShape(ShapeType shapeType) {
        switch (shapeType) {
            case CIRCLE:
                return new Circle();
            case RECTANGLE:
                return new Rectangle();
            case SQUARE:
                return new Square();

            default:
                throw new RuntimeException("shape type: " + shapeType + " is not impimented");
        }
    }

    enum ShapeType {
        CIRCLE,
        RECTANGLE,
        SQUARE
    }
}
