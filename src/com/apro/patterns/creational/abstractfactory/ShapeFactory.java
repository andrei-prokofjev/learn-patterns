package com.apro.patterns.creational.abstractfactory;

public class ShapeFactory extends AbstractFactory {
    @Override
    Color getColor(String color) {
        if (color == null) {
            return null;
        }

        if (color.equalsIgnoreCase("red")) {
            return new Red();
        } else if (color.equalsIgnoreCase("green")) {
            return new Green();
        } else if (color.equalsIgnoreCase("blue")) {
            return new Blue();
        }

        return null;
    }

    @Override
    Shape getShape(ShapeType type) {
        if (type == null) {
            return null;
        }

        switch (type) {
            case RECTANGLE:
                return new Rectangle();
            case CIRCLE:
                return new Circle();
            case SQUARE:
                return new Square();
        }

        return null;
    }
}
