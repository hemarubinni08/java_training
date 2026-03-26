package com.ust.impl;

import com.ust.VehicleInterfaceAnu;

public class CarInterfaceAnuImpl implements VehicleInterfaceAnu {
    @Override
    public int noOfWheels() {
        return 2;
    }

    @Override
    public int maxSpeed() {
        return 100;
    }

    @Override
    public String getBrand() {
        return "MG";
    }
}
