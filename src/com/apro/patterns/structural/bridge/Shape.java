package com.apro.patterns.structural.bridge;

public abstract class Shape {
    protected final DrawApi drawApi;

    public Shape(DrawApi drawApi) {
        this.drawApi = drawApi;
    }

    public abstract void draw();
}
