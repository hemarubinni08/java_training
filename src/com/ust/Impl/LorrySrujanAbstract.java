package com.ust.Impl;

public class LorrySrujanAbstract extends VehicleAbstractSrujan {
    @Override
    public int numberOfWheels() {
        return 18;
    }

    @Override
    public String fuelType() {
        return "Diesel";
    }

    @Override
    public int costOfVehicle() {
        return 2000000;
    }
}
