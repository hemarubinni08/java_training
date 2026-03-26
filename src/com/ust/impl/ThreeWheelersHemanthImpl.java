package com.ust.impl;

import com.ust.VehicleInterfaceHemanth;

public class ThreeWheelersHemanthImpl implements VehicleInterfaceHemanth {
    @Override
    public String typeOfVehicle() {
        return "Auto";
    }

    @Override
    public String modelName() {
        return "Mahindra";
    }

    @Override
    public int mileage() {
        return 20;
    }
}
