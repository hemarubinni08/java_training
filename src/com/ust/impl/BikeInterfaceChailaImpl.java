package com.ust.impl;

import com.ust.VehicleInterfaceChaila;

public class BikeInterfaceChailaImpl implements VehicleInterfaceChaila {
    @Override
    public int getNumberOfSeats() {
        return 2;
    }

    @Override
    public int getNumberOfWheels() {
        return 2;
    }

    @Override
    public String getBrand() {
        return null;
    }

    @Override
    public boolean airConditioner() {
        return false;
    }

    @Override
    public int getDoors() {
        return 0;
    }
}
