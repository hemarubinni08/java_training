package com.ust.impl;

import com.ust.VehicleAbstractPranav;

public class Bus1AbstractPranav extends VehicleAbstractPranav {
    @Override
    public int numberOfWheels() {
        return 8;
    }

    @Override
    public String engineCapacity() {
        return "800cc";
    }

    @Override
    public String fuelType() {
        return "Diesel";
    }
}
