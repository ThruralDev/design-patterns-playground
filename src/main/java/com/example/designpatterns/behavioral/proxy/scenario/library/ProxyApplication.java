package com.example.designpatterns.behavioral.proxy.scenario.library;

import com.example.designpatterns.behavioral.proxy.scenario.library.third_party.YouTubeClass;

public class ProxyApplication {


    public static void main(String[] args) {

        YouTubeClass originalClass = new YouTubeClass();
        originalClass.downloadVideo(1);

        // Now we wrap original class to provide customized behavior.
        CachedYoutubeClass proxyClass = new CachedYoutubeClass(originalClass);
        YouTubeManager manager = new YouTubeManager(proxyClass);
        manager.downloadVideo(1);
    }
}
