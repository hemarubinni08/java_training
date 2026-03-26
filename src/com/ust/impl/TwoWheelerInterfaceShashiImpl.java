package com.ust.impl;

import com.ust.VehicleInterfaceShashi;

public class TwoWheelerInterfaceShashiImpl implements VehicleInterfaceShashi {
    @Override
    public int getNumberOfWheels() {
        return 2;
    }

    @Override
    public String getBrandName() {
        return "Honda";
    }

    @Override
    public String getModelName() {
        return "Shine";
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
