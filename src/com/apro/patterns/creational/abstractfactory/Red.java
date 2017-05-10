package com.apro.patterns.creational.abstractfactory;

public class Red implements Color {
    @Override
    public void fill() {
        System.out.println(">>> Inside Red::fill() method.");
    }
}
