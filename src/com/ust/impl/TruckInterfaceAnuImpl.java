package com.ust.impl;

import com.ust.VehicleInterfaceAnu;

public class TruckInterfaceAnuImpl implements VehicleInterfaceAnu {
    @Override
    public int noOfWheels() {
        return 4;
    }

    @Override
    public int maxSpeed() {
        return 120;
    }

    @Override
    public String getBrand() {
        return "TATA";
    }
}
