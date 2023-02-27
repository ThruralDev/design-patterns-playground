package com.example.designpatterns.behavioral.proxy.scenario.library.third_party;

public interface YouTubeApi {

    void listVideos();

    void getVideoInfo(int id);

    void downloadVideo(int id);
}
