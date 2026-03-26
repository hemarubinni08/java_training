package com.ust.impl;

import com.ust.VehicleAbstractAron;

public class CarAbstractAronImpl extends VehicleAbstractAron {
    public String getSound() {
        return "Vrroom";
    }

    public int getNoOfWheels() {
        return 4;
    }

    public String getBrandName() {
        return "Volvo";
    }

    public String getDoorType() {
        return "Sideways";
    }
}
