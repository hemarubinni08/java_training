package com.ust.impl;

import com.ust.HeavyVehicleChailashree;
import com.ust.VehicleInterfaceChaila;

public class CarInterfaceChailaImpl implements VehicleInterfaceChaila, HeavyVehicleChailashree {
    @Override
    public int getNumberOfSeats() {
        return 4;
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
    public boolean stearingControl() {
        return true;
    }
    @Override
    public boolean airConditioner() {
        return true;
    }
    @Override
    public int getDoors() {
        return 4;
    }
}
