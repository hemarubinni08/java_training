package com.ust.impl;

import com.ust.VehicleAbstractLogesh;

public class CarAbstractLogesh extends VehicleAbstractLogesh {
    public Integer getDoor() {
        return 4;
    }

    @Override
    public Integer getNumberOfWheels() {
        return 0;
    }

    @Override
    public String getModel() {
        return "";
    }

    public Integer getPrice() {
        return 100000;
    }

    public Integer getLaunchYear() {
        return 2026;
    }

    public int getNumberOfSeat() {
        return 4;
    }

    public boolean getLoadBed() {
        return false;
    }
}
