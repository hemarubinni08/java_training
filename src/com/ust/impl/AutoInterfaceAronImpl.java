package com.ust.impl;

import com.ust.HeavyVehicleInterfaceAron;
import com.ust.VehicleInterfaceAron;

public class AutoInterfaceAronImpl implements VehicleInterfaceAron, HeavyVehicleInterfaceAron {
    @Override
    public String getSound() {
        return "Kssrrrr";
    }

    @Override
    public int getNoOfWheels() {
        return 3;
    }

    @Override
    public int getWarrantyInYears() {
        return 2;
    }

    @Override
    public String getBrandName() {
        return "Ashok Leyland";
    }

    @Override
    public int getNoOfDoors() {
        return 1;
    }
}
