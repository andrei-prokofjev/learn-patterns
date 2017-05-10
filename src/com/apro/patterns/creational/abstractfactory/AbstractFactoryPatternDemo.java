package com.apro.patterns.creational.abstractfactory;

import com.apro.patterns.creational.abstractfactory.AbstractFactory.ShapeType;

public class AbstractFactoryPatternDemo {

    public static void main(String[] args) {
        AbstractFactory shapeFactory = FactoryProducer.getFactory("shape");
        Shape circle = shapeFactory.getShape(ShapeType.CIRCLE);
        circle.draw();
    }
}
