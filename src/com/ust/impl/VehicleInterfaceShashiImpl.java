package com.ust.impl;

import com.ust.VehicleInterfaceShashi;

public class VehicleInterfaceShashiImpl implements VehicleInterfaceShashi {
    @Override
    public int getNumberOfWheels() {
        return 4;
    }

    @Override
    public String getBrandName() {
        return "Honda";
    }

    @Override
    public String getModelName() {
        return "City";
    }

    @Override
    public String getFuelType() {
        return "Petrol";
    }

    @Override
    public String getBrakeType() {
        return "Disc";
    }

    @Override
    public int getYearsOfInsurance() {
        return 5;
    }
}
