package com.ust.impl;

import com.ust.VehicleInterfaceHemanth;

public class TwoWheelersHemanthImpl implements VehicleInterfaceHemanth {
    @Override
    public String typeOfVehicle() {
        return "Bike";
    }

    @Override
    public String modelName() {
        return "Yamaha";
    }

    @Override
    public int mileage() {
        return 40;
    }
}
