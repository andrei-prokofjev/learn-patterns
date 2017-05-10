package com.apro.patterns.structural.adapter;

public class Mp3MediaPlayer implements AdvancedMediaPlayer {

    @Override
    public void playMp3(String fileName) {
        System.out.println("Playing mp3 file. Name: " + fileName);
    }

    @Override
    public void playVlc(String fileName) {

    }
}
