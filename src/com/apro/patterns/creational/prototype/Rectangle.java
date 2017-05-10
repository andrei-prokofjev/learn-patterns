package com.apro.patterns.creational.prototype;

class Rectangle extends Shape {

    Rectangle() {
        type = "rectangle";
    }

    @Override
    void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }


}
