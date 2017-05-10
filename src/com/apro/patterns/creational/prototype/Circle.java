package com.apro.patterns.creational.prototype;

class Circle extends Shape {
    Circle() {
        type = "circle";
    }

    @Override
    void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
