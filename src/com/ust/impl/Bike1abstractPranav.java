package com.ust.impl;

import com.ust.VehicleAbstractPranav;

public class Bike1abstractPranav extends VehicleAbstractPranav {
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
