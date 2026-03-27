package com.ust.impl;

import com.ust.VehicleAbstractYesh;

public class VehicleCarYeshImpl extends VehicleAbstractYesh {
    @Override
    protected int numberOfWheels() {
        return 4;
    }

    @Override
    protected int maxSpeedOfVehicle() {
        return 200;
    }

    @Override
    protected String colorOfVehicle() {
        return "Blue";
    }
}
