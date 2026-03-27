package com.ust.impl;

import com.ust.HeavyVehicleInterfaceBew;
import com.ust.VehicleInterfaceBew;

public class TruckInterfaceBewimpl implements VehicleInterfaceBew, HeavyVehicleInterfaceBew {
    @Override
    public int numberOfWheels() {
        return 8;
    }

    @Override
    public String colour() {
        return "";
    }

    @Override
    public String getBrand() {
        return "Bharat Benz";
    }

    @Override
    public Boolean isPublicTransport() {
        return false;
    }

    @Override
    public Boolean hasAc() {
        return true;
    }

    @Override
    public int numberOfDoors() {
        return 2;
    }
}
