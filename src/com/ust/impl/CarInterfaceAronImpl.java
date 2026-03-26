package com.ust.impl;

import com.ust.HeavyVehicleInterfaceAron;
import com.ust.VehicleInterfaceAron;

public class CarInterfaceAronImpl implements VehicleInterfaceAron, HeavyVehicleInterfaceAron {
    @Override
    public String getSound() {
        return "Vroom";
    }

    @Override
    public int getNoOfWheels() {
        return 4;
    }

    @Override
    public int getWarrantyInYears() {
        return 5;
    }

    @Override
    public String getBrandName() {
        return "BMW";
    }

    @Override
    public int getNoOfDoors() {
        return 4;
    }
}
