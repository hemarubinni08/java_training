package com.ust.impl;

import com.ust.VehicleAbstractAron;

public abstract class HeavyVehicleAbstractClassImpl extends VehicleAbstractAron {

    protected String getSound() {
        return "Grgrrrr";
    }

    protected String getBrandName() {
        return "Volvo";
    }

    protected int getNoOfWheels() {
        return 4;
    }

    protected abstract int getNoOfDoors();
}
