package com.apro.patterns.structural.adapter;

public class VlcMediaPlayer implements AdvancedMediaPlayer {

    @Override
    public void playMp3(String fileName) {

    }

    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name: " + fileName);
    }
}
