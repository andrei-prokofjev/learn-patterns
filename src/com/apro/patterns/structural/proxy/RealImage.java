package com.apro.patterns.structural.proxy;

public class RealImage implements Image {

    private final String fileName;

    RealImage(String fileName) {
        this.fileName = fileName;
        downloadImage();
    }

    @Override
    public void display() {
        System.out.println(">>>> display image: " + fileName);
    }

    private void downloadImage() {
        System.out.println(">>>> download image: " + fileName);
    }
}
