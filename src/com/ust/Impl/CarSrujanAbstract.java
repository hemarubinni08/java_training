package com.ust.Impl;

public class CarSrujanAbstract extends VehicleAbstractSrujan {
    @Override
    public int numberOfWheels() {
        return 4;
    }

    @Override
    public String fuelType() {
        return "Diesel";
    }

    @Override
    public int costOfVehicle() {
        return 1000000;
    }
}
