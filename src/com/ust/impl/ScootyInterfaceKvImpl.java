package com.ust.impl;

import com.ust.VehicleInterfaceKv;

public class ScootyInterfaceKvImpl implements VehicleInterfaceKv {
    @Override
    public int noOfWheels() {
        return 2;
    }

    @Override
    public int maxSpeed() {
        return 0;
    }

    @Override
    public String getBrand() {
        return "Honda";
    }
}
