package com.ust.impl;

import com.ust.HeavyVehicleInterfaceAron;
import com.ust.VehicleInterfaceAron;

public class LorryInterfaceAronImpl implements VehicleInterfaceAron, HeavyVehicleInterfaceAron {
    @Override
    public String getSound() {
        return "Grrrgggrrr";
    }

    @Override
    public int getNoOfWheels() {
        return 6;
    }

    @Override
    public int getWarrantyInYears() {
        return 10;
    }

    @Override
    public String getBrandName() {
        return "Bharat Benz";
    }

    @Override
    public int getNoOfDoors() {
        return 2;
    }
}
