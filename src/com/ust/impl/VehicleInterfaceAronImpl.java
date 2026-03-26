package com.ust.impl;

import com.ust.VehicleInterfaceAron;

public class VehicleInterfaceAronImpl implements VehicleInterfaceAron {
    @Override
    public String getSound() {
        return "Vroom";
    }

    @Override
    public int getNoOfWheels() {
        return 2;

    }

    @Override
    public int getWarrantyInYears() {
        return 2;
    }

    @Override
    public String getBrandName() {
        return "Benz";
    }
}
