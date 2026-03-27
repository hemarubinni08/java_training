package com.ust.impl;

import com.ust.VehicleInterfaceAnu;

public class BikeInterfaceAnuImpl implements VehicleInterfaceAnu {
    @Override
    public int noOfWheels() {
        return 2;
    }

    @Override
    public int maxSpeed() {
        return 70;
    }

    @Override
    public String getBrand() {
        return "Royal Enfield";
    }
}
