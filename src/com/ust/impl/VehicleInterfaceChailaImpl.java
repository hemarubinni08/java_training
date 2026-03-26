package com.ust.impl;

import com.ust.VehicleInterfaceChaila;

public class VehicleInterfaceChailaImpl implements VehicleInterfaceChaila {
    @Override
    public int getNumberOfSeats() {
        return 10;
    }
    @Override
    public int getNumberOfWheels() {
        return 4;
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
        return 2;
    }
}
