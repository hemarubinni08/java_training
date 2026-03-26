package com.ust.impl;

import com.ust.HeavyVehicleInterfaceShashi;
import com.ust.VehicleInterfaceShashi;

public class LorryInterfaceShashiImpl implements VehicleInterfaceShashi, HeavyVehicleInterfaceShashi {
    @Override
    public int getNumberOfWheels() {
        return 8;
    }

    @Override
    public String getBrandName() {
        return "Eicher";
    }

    @Override
    public String getModelName() {
        return "20251C";
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
