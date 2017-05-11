package com.apro.patterns.structural.proxy;

public class ProxyPatternDemo {
    public static void main(String[] args) {

        ProxyImage proxyImage = new ProxyImage("aaa.png");

        proxyImage.display();
        proxyImage.display();
    }
}
