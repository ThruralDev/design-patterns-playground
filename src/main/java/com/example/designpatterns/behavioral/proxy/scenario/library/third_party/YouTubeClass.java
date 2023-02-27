package com.example.designpatterns.behavioral.proxy.scenario.library.third_party;

public class YouTubeClass implements YouTubeApi{

    @Override
    public void listVideos() {

        System.out.println("Listing all videos.");
    }

    @Override
    public void getVideoInfo(int id) {

        System.out.println(String.format("Get video with id %s", id));
    }

    @Override
    public void downloadVideo(int id) {

        System.out.println(String.format("Downlaod video with id %s", id));
    }
}
