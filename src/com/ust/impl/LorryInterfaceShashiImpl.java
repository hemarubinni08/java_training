package com.ust.impl;

import com.ust.HeavyVehicleInterfaceShashi;
import com.ust.VehicleInterfaceShashi;

public class LorryInterfaceShashiImpl implements VehicleInterfaceShashi, HeavyVehicleInterfaceShashi {
    public int getNumberOfWheels() {
        return 8;
    }

    public String getBrandName() {
        return "Eicher";
    }

    public String getModelName() {
        return "20251C";
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
