package com.ust.impl;

public class BikeAbstractKushal extends VehicleAbstractKushal {
    @Override
    public int getWheelsCount() {
        return 2;
    }

    @Override
    public String getColour() {
        return "Red";
    }

    @Override
    public String getBrand() {
        return "KTM";
    }

    @Override
    public String getVehicleType() {
        return "LMV";
    }

    @Override
    public boolean hasWindows() {
        return false;
    }
}
