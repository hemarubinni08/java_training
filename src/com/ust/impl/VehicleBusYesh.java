package com.ust.impl;

import com.ust.VehicleAbstractYesh;

public class VehicleBusYesh extends VehicleAbstractYesh {
    @Override
    protected int numberOfWheels() {
        return 6;
    }

    @Override
    protected int maxSpeedOfVehicle() {
        return 100;
    }

    @Override
    protected String colorOfVehicle() {
        return "White";
    }
}
