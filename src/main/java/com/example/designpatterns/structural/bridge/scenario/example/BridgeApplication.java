package com.example.designpatterns.structural.bridge.scenario.example;

import com.example.designpatterns.structural.bridge.scenario.example.device.Radio;
import com.example.designpatterns.structural.bridge.scenario.example.device.TV;
import com.example.designpatterns.structural.bridge.scenario.example.remote.Remote;

public class BridgeApplication {

    public static void main(String[] args) {

        Remote remoteTV = new Remote(new TV());
        remoteTV.powerOn();
        remoteTV.checkStatus();
        remoteTV.powerOff();

        Remote remoteRadio = new Remote(new Radio());
        remoteRadio.powerOn();
        remoteRadio.checkStatus();
        remoteRadio.powerOff();
    }
}
