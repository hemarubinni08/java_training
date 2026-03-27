package com.ust.impl;

import com.ust.VehicleInterfaceGokul;

public class VehicleInterfaceGokulImpl implements VehicleInterfaceGokul {
    public int numberOfWheels() {
        return 4;
    }

    public int maximumSpeed() {
        return 120;
    }

    public int seatAvailable() {
        return 4;
    }

}
