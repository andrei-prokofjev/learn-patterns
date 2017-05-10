package com.apro.patterns.structural.bridge;

public class Circle extends Shape {

    private final int x;
    private final int y;
    private final int radius;

    public Circle(int x, int y, int radius, DrawApi drawApi) {
        super(drawApi);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {
        drawApi.drawCircle(radius, x, y);
    }
}
