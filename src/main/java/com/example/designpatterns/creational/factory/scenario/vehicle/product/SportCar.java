package com.example.designpatterns.creational.factory.scenario.vehicle.product;

public class SportCar implements Vehicle {

    @Override
    public void build() {

        System.out.println("Build Sportcar..");
    }
}
