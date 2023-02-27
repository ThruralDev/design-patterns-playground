package com.example.designpatterns.structural.bridge.scenario.example.remote;

import com.example.designpatterns.structural.bridge.scenario.example.device.Device;

public class AdvancedRemote extends Remote {

    public AdvancedRemote(Device device) {

        super(device);
    }

    @Override
    public void powerOn() {

        super.powerOn();
    }

    @Override
    public void powerOff() {

        super.powerOff();
    }

    @Override
    public void checkStatus() {

        super.checkStatus();
    }

    public void mute(){

        System.out.println("Muting!");
    }
}
