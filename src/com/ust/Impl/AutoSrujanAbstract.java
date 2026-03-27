package com.ust.Impl;

public class AutoSrujanAbstract extends VehicleAbstractSrujan {
    @Override
    public int numberOfWheels() {
        return 3;
    }

    @Override
    public String fuelType() {
        return "Diesel";
    }

    @Override
    public  int costOfVehicle() {
        return 300000;
    }
}
