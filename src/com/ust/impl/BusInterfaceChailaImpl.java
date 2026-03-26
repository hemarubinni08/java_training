package com.ust.impl;

import com.ust.HeavyVehicleChailashree;
import com.ust.VehicleInterfaceChaila;

public class BusInterfaceChailaImpl implements VehicleInterfaceChaila, HeavyVehicleChailashree {
    @Override
    public int getNumberOfSeats() {
        return 20;
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
        return false;
    }

    @Override
    public int getDoors() {
        return 1;
    }
}
