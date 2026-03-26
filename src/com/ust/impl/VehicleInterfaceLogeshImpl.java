package com.ust.impl;

import com.ust.VehicleInterface;

public class VehicleInterfaceLogeshImpl implements VehicleInterface {

    @Override
    public Integer getNumberOfWheels() {
        return 4;
    }

    @Override
    public String getModel() {
        return "Honda";
    }

    @Override
    public Integer getPrice() {
        return 100000;
    }
}
