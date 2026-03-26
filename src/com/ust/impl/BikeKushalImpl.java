package com.ust.impl;

import com.ust.VehicleInterfaceKushal;

public class BikeKushalImpl implements VehicleInterfaceKushal {

    @Override
    public int getWheelsCounnt() {
        return 2;
    }

    @Override
    public String getColour() {
        return "Black";
    }

    @Override
    public String getBrand() {
        return "Yamaha";
    }

    @Override
    public String getVehicleType() {
        return "LMV";
    }
}
