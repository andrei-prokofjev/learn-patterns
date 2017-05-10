package com.apro.patterns.structural.bridge;

public class BridgePatternDemo {

    public static void main(String[] args) {

        Shape redCircle = new Circle(10, 10, 100, new RedCircle());
        Shape greenCircle = new Circle(100, 100, 1000, new GreenCircle());

        greenCircle.draw();
        redCircle.draw();
    }

}
