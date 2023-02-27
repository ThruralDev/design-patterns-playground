package com.example.designpatterns.structural.bridge.scenario.example.device;

public class TV implements Device {

    @Override
    public void isEnabled() {

        System.out.println("Checking if TV is enabled!");
    }

    @Override
    public void enable() {

        System.out.println("TV enabled!");
    }

    @Override
    public void disable() {

        System.out.println("TV disabled!");
    }
}
