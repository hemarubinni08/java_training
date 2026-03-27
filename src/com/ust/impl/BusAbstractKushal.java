package com.ust.impl;

public class BusAbstractKushal extends VehicleAbstractKushal {
    @Override
    public int getWheelsCount() {
        return 6;
    }

    @Override
    public String getColour() {
        return "White";
    }

    @Override
    public String getBrand() {
        return "Tata";
    }

    @Override
    public String getVehicleType() {
        return "HMV";
    }
}
