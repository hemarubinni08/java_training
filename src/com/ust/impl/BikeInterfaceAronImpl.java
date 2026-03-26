package com.ust.impl;

import com.ust.VehicleInterfaceAron;

public class BikeInterfaceAronImpl implements VehicleInterfaceAron {
    @Override
    public String getSound() {
        return "Drrrr";
    }

    @Override
    public int getNoOfWheels() {
        return 2;
    }

    @Override
    public int getWarrantyInYears() {
        return 4;
    }

    @Override
    public String getBrandName() {
        return "Honda";
    }
}
