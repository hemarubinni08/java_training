package com.ust.impl;

import com.ust.VehicleInterfaceAnu;

public class BikeInterfaceImpl implements VehicleInterfaceAnu {
    @Override
    public int noOfWheels() {
        return 2;
    }

    @Override
    public int maxSpeed() {
        return 90;
    }

    @Override
    public String getBrand() {
        return "KTM";
    }
}
