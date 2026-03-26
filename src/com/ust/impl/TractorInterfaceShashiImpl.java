package com.ust.impl;

import com.ust.HeavyVehicleInterfaceShashi;
import com.ust.VehicleInterfaceShashi;

public class TractorInterfaceShashiImpl implements VehicleInterfaceShashi, HeavyVehicleInterfaceShashi {
    @Override
    public int getNumberOfWheels() {
        return 4;
    }

    @Override
    public String getBrandName() {
        return "Mahindra";
    }

    @Override
    public String getModelName() {
        return "124C Yuvo";
    }

    @Override
    public String getFuelType() {
        return "Diesel";
    }

    @Override
    public String getBrakeType() {
        return "Air Compact System";
    }

    @Override
    public int getYearsOfInsurance() {
        return 10;
    }
}
