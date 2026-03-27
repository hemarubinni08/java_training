package com.ust.impl;

import com.ust.VehicleInterfaceKv;

public class BikeInterfaceKvImpl implements VehicleInterfaceKv {
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
        return "HONDA";
    }
}
