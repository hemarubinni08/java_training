package com.ust.impl;

import com.ust.HeavyVehicleInterfaceGokul;
import com.ust.VehicleInterfaceGokul;

public class TruckInterfaceGokulImpl implements VehicleInterfaceGokul, HeavyVehicleInterfaceGokul {
    public int numberOfWheels() {
        return 4;
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
        return true;
    }

    public boolean isPublicTransport() {
        return true;
    }
}
