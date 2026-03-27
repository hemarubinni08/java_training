package com.ust.impl;

import com.ust.VehicleInterfaceShashi;

public class TwoWheelerInterfaceShashiImpl implements VehicleInterfaceShashi {
    public int getNumberOfWheels() {
        return 2;
    }

    public String getBrandName() {
        return "Honda";
    }

    public String getModelName() {
        return "Shine";
    }

    public String getFuelType() {
        return "Petrol";
    }

    public String getBrakeType() {
        return "Disc";
    }

    public int getYearsOfInsurance() {
        return 5;
    }
}
