package com.ust.impl;

import com.ust.VehicleAbstractPranav;

public class Car1AbstractPranav extends VehicleAbstractPranav {
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
