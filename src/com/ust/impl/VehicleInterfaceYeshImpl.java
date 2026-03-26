package com.ust.impl;

import com.ust.VehicleInterfaceYesh;

public class VehicleInterfaceYeshImpl implements VehicleInterfaceYesh {

    @Override
    public int numberOfwheels() {
        return 4;
    }

    @Override
    public int maxSpeedOfVehicle() {
        return 100;
    }

    @Override
    public String colorOfVehicle() {
        return "Black";
    }


    }

