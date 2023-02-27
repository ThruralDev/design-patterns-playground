package com.example.designpatterns.behavioral.proxy.scenario.library;

import com.example.designpatterns.behavioral.proxy.scenario.library.third_party.YouTubeApi;

public class CachedYoutubeClass implements YouTubeApi{

    private final YouTubeApi youTubeApi;

    public CachedYoutubeClass(YouTubeApi youTubeApi) {

        this.youTubeApi = youTubeApi;
    }

    @Override
    public void listVideos() {

    }

    @Override
    public void getVideoInfo(int id) {


    }

    @Override
    public void downloadVideo(int id) {

        System.out.println("Download in progress. Please be patient.");
    }
}
