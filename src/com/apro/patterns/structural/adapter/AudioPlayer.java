package com.apro.patterns.structural.adapter;

public class AudioPlayer implements MediaPlayer {
    @Override
    public void play(String mediaType, String fileName) {
        //inbuilt support to play mp4 music files
        if (mediaType.equalsIgnoreCase("mp4")) {
            System.out.println(">>> Playing mp4 file. Name: " + fileName);
        } else if (mediaType.equalsIgnoreCase("vlc") || mediaType.equalsIgnoreCase("mp3")) {
            MediaAdapter mediaAdapter = new MediaAdapter(mediaType);
            mediaAdapter.play(mediaType, fileName);
        } else {
            System.out.println("!!!  Invalid media. " + mediaType + " format not supported");
        }


    }
}
