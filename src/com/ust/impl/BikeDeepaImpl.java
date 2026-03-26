package com.ust.impl;

import com.ust.VehicleInterfaceDeepa;

public class BikeDeepaImpl implements VehicleInterfaceDeepa {
    @Override
    public int numberOfWheels() {
        return 2;
    }

    @Override
    public String vehicleColour() {
        return "Black";
    }

    @Override
    public String vehicleBrand() {
        return "Enfield";
    }

    @Override
    public int numberOfDoors() {
        return 0;
    }
}
