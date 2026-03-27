package com.ust.impl;

public class CarAbstractKushal extends VehicleAbstractKushal {
    @Override
    public int getWheelsCount() {
        return 4;
    }

    @Override
    public String getColour() {
        return "Black";
    }

    @Override
    public String getBrand() {
        return "Mercedes";
    }

    @Override
    public String getVehicleType() {
        return "HMV";
    }
}
