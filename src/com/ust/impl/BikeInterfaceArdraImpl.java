package com.ust.impl;

import com.ust.VehicleInterfaceArdra;

public class BikeInterfaceArdraImpl implements VehicleInterfaceArdra {

    @Override
    public int numberOfWheels() {
        return 2;
    }

    @Override
    public String getSizeOfVehicle() {
        return "Small";
    }

    @Override
    public int maximumPassengers() {
        return 2;
    }

    @Override
    public int numberOfDoors() {
        return 0;
    }

    @Override
    public boolean needsHelmet() {
        return true;
    }
}
