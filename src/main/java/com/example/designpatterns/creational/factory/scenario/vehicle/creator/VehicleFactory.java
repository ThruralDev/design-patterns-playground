package com.example.designpatterns.creational.factory.scenario.vehicle.creator;

import com.example.designpatterns.creational.factory.scenario.vehicle.product.Vehicle;

public abstract class VehicleFactory {

    public Vehicle create(){

        Vehicle vehicle = createVehicle();
        vehicle.build();
        return vehicle;
    }

    protected abstract Vehicle createVehicle();
}
