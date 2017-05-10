package com.apro.patterns.structural.adapter;

public class AdapterPatternDemo {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "aaa.mp3");
        audioPlayer.play("mp4", "aaa.mp4");
        audioPlayer.play("vlc", "aaa.vlc");


    }
}
