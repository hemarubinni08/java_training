package com.ust.Impl;

public class BikeSrujanAbstract extends VehicleAbstractSrujan {
    @Override
    public int numberOfWheels() {
        return 2;
    }

    @Override
    public String fuelType() {
        return "petrol";
    }

    @Override
    public int costOfVehicle() {
        return 150000;
    }

    public boolean hasWindows() {
        return false;
    }
}
