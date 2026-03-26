package com.ust.impl;

import com.ust.HeavyVehicleInterfaceBew;
import com.ust.VehicleInterfaceBew;

public class CarInterfaceBewimpl implements VehicleInterfaceBew, HeavyVehicleInterfaceBew {
    @Override
    public int numberOfWheels() {
        return 4;
    }

    @Override
    public String colour() {
        return "Blue";
    }

    @Override
    public String getBrand() {
        return "Benz";
    }

    @Override
    public Boolean isPublicTransport() {
        return false;
    }

    @Override
    public Boolean hasAc() {
        return false;
    }

    @Override
    public int numberOfDoors() {
        return 4;
    }
}
