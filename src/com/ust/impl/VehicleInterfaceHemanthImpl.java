package com.ust.impl;

import com.ust.VehicleInterfaceHemanth;

public class VehicleInterfaceHemanthImpl implements VehicleInterfaceHemanth {
    @Override
    public String typeOfVehicle() {
        return "Bike";
    }

    @Override
    public String modelName() {
        return "Triumph";
    }

    @Override
    public int mileage() {
        return 30;
    }
}
