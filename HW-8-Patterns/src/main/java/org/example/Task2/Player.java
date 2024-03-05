package org.example.Task2;

public class Player implements MediaPlayer {
    private VideoPlayer videoPlayer;

    public Player(VideoPlayer videoPlayer) {
        this.videoPlayer = videoPlayer;
    }
    @Override
    public void play() {
        this.videoPlayer.playAvi();
    }
}
