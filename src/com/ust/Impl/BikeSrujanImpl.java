package com.ust.Impl;

import com.ust.VehicleInterfaceSrujan;

public class BikeSrujanImpl implements VehicleInterfaceSrujan {

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
}
