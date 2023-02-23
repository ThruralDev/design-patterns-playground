package com.example.designpatterns.behavioral.bridge.scenario.example.device;

public class Radio implements Device{

    @Override
    public void isEnabled() {

        System.out.println("Checking if Radio is enabled!");
    }

    @Override
    public void enable() {

        System.out.println("Radio enabled!");
    }

    @Override
    public void disable() {

        System.out.println("Radio disabled!");
    }
}
