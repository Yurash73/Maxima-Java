package org.example.Task2;

public class Main {
    public static void main(String[] args) {

        VideoPlayer videoPlayer = new VideoPlayer();
        Player player= new Player(videoPlayer);

        player.play();

    }
}
