package com.ust.impl;

import com.ust.VehicleInterfacePranav;

public class Car1PranavImpl implements VehicleInterfacePranav {
    @Override
    public int numberOfWheels() {
        return 4;
    }

    @Override
    public String engineCapacity() {
        return "1500cc";
    }

    @Override
    public String fuelType() {
        return "Diesel";
    }
}
