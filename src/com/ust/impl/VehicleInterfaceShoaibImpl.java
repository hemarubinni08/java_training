package com.ust.impl;

import com.ust.VehicleInterfaceShoaib;

public class VehicleInterfaceShoaibImpl implements VehicleInterfaceShoaib {
    @Override
    public int kilometerDone() {
        return 10000;
    }

    @Override
    public int numberOfWheels() {
        return 0;
    }

    @Override
    public String vehicleBrand() {
        return "";
    }
}
