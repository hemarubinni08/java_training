package com.ust.impl;

import com.ust.VehicleInterfaceKv;

public class TruckInterfaceKvImpl implements VehicleInterfaceKv,HeavyVehicleInterfaceKv {
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

    @Override
    public boolean hasAc() {
        return true;
    }

    @Override
    public int noOfPassengers() {
        return 6;
    }
}
