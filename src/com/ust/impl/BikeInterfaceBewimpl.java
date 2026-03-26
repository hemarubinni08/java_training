package com.ust.impl;

import com.ust.VehicleInterfaceBew;

public class BikeInterfaceBewimpl implements VehicleInterfaceBew {
    @Override
    public int numberOfWheels() {
        return 2;
    }

    @Override
    public String colour() {
        return "Black";
    }

    @Override
    public String getBrand() {
        return "Honda";
    }
}
