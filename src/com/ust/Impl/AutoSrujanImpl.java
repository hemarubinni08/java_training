package com.ust.Impl;

import com.ust.VehicleInterfaceSrujan;

public class AutoSrujanImpl implements VehicleInterfaceSrujan {
    @Override
    public int numberOfWheels() {
        return 3;
    }

    @Override
    public String fuelType() {
        return "Diesel";
    }

    @Override
    public int costOfVehicle() {
        return 300000;
    }
}
