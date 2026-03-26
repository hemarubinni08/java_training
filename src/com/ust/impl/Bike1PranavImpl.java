package com.ust.impl;

import com.ust.VehicleInterfacePranav;

public class Bike1PranavImpl implements VehicleInterfacePranav {
    @Override
    public int numberOfWheels() {
        return 2;
    }

    @Override
    public String engineCapacity() {
        return "350cc";
    }

    @Override
    public String fuelType() {
        return "Petrol";
    }
}
