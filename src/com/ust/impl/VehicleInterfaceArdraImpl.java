package com.ust.impl;

import com.ust.HeavyVehiclesInterfaceArdra;
import com.ust.VehicleInterfaceArdra;

public abstract class VehicleInterfaceArdraImpl implements VehicleInterfaceArdra, HeavyVehiclesInterfaceArdra {
    @Override
    public int numberOfWheels() {
        return 4;
    }

    @Override
    public String getSizeOfVehicle() {
        return "43";
    }

    @Override
    public int maximumPassengers() {
        return 43;
    }

    @Override
    public int numberOfDoors() {
        return 4;
    }

    @Override
    public boolean needsHelmet() {
        return false;
    }
}