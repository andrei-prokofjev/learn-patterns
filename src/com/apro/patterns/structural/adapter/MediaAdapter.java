package com.apro.patterns.structural.adapter;

public class MediaAdapter implements MediaPlayer {

    AdvancedMediaPlayer mediaPlayer;

    public MediaAdapter(String type) {
        if (type.equalsIgnoreCase("mp3")) {
            mediaPlayer = new Mp3MediaPlayer();
        } else if (type.equalsIgnoreCase("vlc")) {
            mediaPlayer = new VlcMediaPlayer();
        }
    }

    @Override
    public void play(String mediaType, String fileName) {
        if (mediaType.equalsIgnoreCase("mp3")) {
            mediaPlayer.playMp3(fileName);
        } else if (mediaType.equalsIgnoreCase("vlc")) {
            mediaPlayer.playVlc(fileName);
        }
    }
}
