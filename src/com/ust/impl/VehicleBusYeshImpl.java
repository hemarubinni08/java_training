package com.ust.impl;

import com.ust.VehicleAbstractYesh;

public class VehicleBusYeshImpl extends VehicleAbstractYesh {
    @Override
    protected int numberOfWheels() {
        return 2;
    }

    @Override
    protected int maxSpeedOfVehicle() {
        return 250;
    }

    @Override
    protected String colorOfVehicle() {
        return "yellow";
    }
}
