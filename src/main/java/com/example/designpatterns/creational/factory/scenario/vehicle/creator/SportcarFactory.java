package com.example.designpatterns.creational.factory.scenario.vehicle.creator;

import com.example.designpatterns.creational.factory.scenario.vehicle.product.SportCar;
import com.example.designpatterns.creational.factory.scenario.vehicle.product.Vehicle;

public class SportcarFactory extends VehicleFactory{

    @Override
    protected Vehicle createVehicle() {

        return new SportCar();
    }
}
