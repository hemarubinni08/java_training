package com.ust.impl;

import com.ust.HeavyVehiclesInterfaceAnu;
import com.ust.VehicleInterfaceAnu;

public class VehicleInterfaceAnuImpl implements VehicleInterfaceAnu, HeavyVehiclesInterfaceAnu {
    @Override
    public int noOfWheels() {
        return 0;
    }

    @Override
    public int maxSpeed() {
        return 0;
    }

    @Override
    public String getBrand() {
        return "";
    }

    @Override
    public boolean hasAc() {
        return false;
    }

    @Override
    public boolean hasGps() {
        return false;
    }

    @Override
    public int noOfPassengers() {
        return 0;
    }
}
