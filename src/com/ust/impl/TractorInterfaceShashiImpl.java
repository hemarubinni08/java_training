package com.ust.impl;

import com.ust.HeavyVehicleInterfaceShashi;
import com.ust.VehicleInterfaceShashi;

public class TractorInterfaceShashiImpl implements VehicleInterfaceShashi, HeavyVehicleInterfaceShashi {
    public int getNumberOfWheels() {
        return 4;
    }

    public String getBrandName() {
        return "Mahindra";
    }

    public String getModelName() {
        return "124C Yuvo";
    }

    public String getFuelType() {
        return "Diesel";
    }

    public String getBrakeType() {
        return "Air Compact System";
    }

    public int getYearsOfInsurance() {
        return 10;
    }
}
