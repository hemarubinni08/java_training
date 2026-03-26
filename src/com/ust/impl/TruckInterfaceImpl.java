package com.ust.impl;

import com.ust.HeavyVehiclesInterfaceAnu;
import com.ust.VehicleInterfaceAnu;

public class TruckInterfaceImpl implements VehicleInterfaceAnu, HeavyVehiclesInterfaceAnu {
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
        return false;
    }

    @Override
    public boolean hasGps() {
        return false;
    }

    @Override
    public int noOfPassengers() {
        return 10;
    }
}
