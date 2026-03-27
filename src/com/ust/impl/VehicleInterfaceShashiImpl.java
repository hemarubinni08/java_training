package com.ust.impl;

import com.ust.VehicleInterfaceShashi;

public class VehicleInterfaceShashiImpl implements VehicleInterfaceShashi {
    public int getNumberOfWheels() {
        return 4;
    }

    public String getBrandName() {
        return "Honda";
    }

    public String getModelName() {
        return "City";
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
