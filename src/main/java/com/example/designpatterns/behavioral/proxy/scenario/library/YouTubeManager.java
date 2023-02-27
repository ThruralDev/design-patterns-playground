package com.example.designpatterns.behavioral.proxy.scenario.library;

import com.example.designpatterns.behavioral.proxy.scenario.library.third_party.YouTubeApi;

public class YouTubeManager {

    private final YouTubeApi youTubeService;

    public YouTubeManager(YouTubeApi youTubeApi) {

        this.youTubeService = youTubeApi;
    }

    void downloadVideo(int id){

        youTubeService.downloadVideo(id);
    }
}
