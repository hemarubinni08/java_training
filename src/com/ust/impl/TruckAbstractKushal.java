package com.ust.impl;

public class TruckAbstractKushal extends VehicleAbstractKushal {

    @Override
    public int getWheelsCount() {
        return 10;
    }

    @Override
    public String getColour() {
        return "Brown";
    }

    @Override
    public String getBrand() {
        return "Volvo";
    }

    @Override
    public String getVehicleType() {
        return "HMV";
    }
}
