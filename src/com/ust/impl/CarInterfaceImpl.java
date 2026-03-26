package com.ust.impl;

import com.ust.HeavyVehiclesInterfaceAnu;
import com.ust.VehicleInterfaceAnu;

public class CarInterfaceImpl implements VehicleInterfaceAnu, HeavyVehiclesInterfaceAnu {
    @Override
    public int noOfWheels() {
        return 4;
    }

    @Override
    public int maxSpeed() {
        return 100;
    }

    @Override
    public String getBrand() {
        return "MG";
    }

    @Override
    public boolean hasAc() {
        return true;
    }

    @Override
    public boolean hasGps() {
        return true;
    }

    @Override
    public int noOfPassengers() {
        return 4;
    }
}
