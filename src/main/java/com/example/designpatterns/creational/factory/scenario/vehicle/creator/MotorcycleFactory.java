package com.example.designpatterns.creational.factory.scenario.vehicle.creator;

import com.example.designpatterns.creational.factory.scenario.vehicle.product.Motorcycle;
import com.example.designpatterns.creational.factory.scenario.vehicle.product.Vehicle;

public class MotorcycleFactory extends VehicleFactory{

    @Override
    protected Vehicle createVehicle() {

        return new Motorcycle();
    }
}
