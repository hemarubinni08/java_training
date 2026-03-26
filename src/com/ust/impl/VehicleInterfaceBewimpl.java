package com.ust.impl;

import com.ust.VehicleInterfaceBew;

public class VehicleInterfaceBewimpl implements VehicleInterfaceBew {
    @Override
    public int numberOfWheels() {
        return 4;
    }

    @Override
    public String colour() {
        return "Red";
    }

    @Override
    public String getBrand() {
        return "Toyota";
    }
}
