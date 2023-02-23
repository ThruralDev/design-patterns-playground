package com.example.designpatterns.behavioral.bridge.scenario.example.remote;

import com.example.designpatterns.behavioral.bridge.scenario.example.device.Device;

public class Remote {

    private final Device device;

    public Remote(Device device) {

        this.device = device;
    }

    public void powerOn() {

        device.enable();
    }

    public void powerOff() {

        device.disable();
    }

    public void checkStatus() {

        device.isEnabled();
    }
}
