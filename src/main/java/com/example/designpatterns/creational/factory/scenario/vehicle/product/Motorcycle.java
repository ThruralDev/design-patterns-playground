package com.example.designpatterns.creational.factory.scenario.vehicle.product;

public class Motorcycle implements Vehicle{

    @Override
    public void build() {
        System.out.println("Build Motorcycle..");
    }
}
