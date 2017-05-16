package com.apro.patterns.behavioral.command;

class Stock {

    private String name = "abc";
    private int quantity = 10;

    void buy() {
        System.out.println("Stock [ Name: " + name + " Quantity: " + quantity + " ] bought");
    }

    void sell() {
        System.out.println("Stock [ Name: " + name + " Quantity: " + quantity + " ] sold");
    }

}
