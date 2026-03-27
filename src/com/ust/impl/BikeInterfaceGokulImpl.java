package com.ust.impl;

import com.ust.HeavyVehicleInterfaceGokul;
import com.ust.VehicleInterfaceGokul;

public class BikeInterfaceGokulImpl implements VehicleInterfaceGokul, HeavyVehicleInterfaceGokul {
    public int numberOfWheels() {
        return 2;
    }

    public int maximumSpeed() {
        return 120;
    }

    public int seatAvailable() {
        return 2;
    }

    public boolean hasAc() {
        return false;
    }

    public boolean hasDoors() {
        return false;
    }

    public boolean isPublicTransport() {
        return false;
    }

}
