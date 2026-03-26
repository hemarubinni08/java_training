package com.ust.impl;

import com.ust.HeavyVehicleInterfaceJava;
import com.ust.VehicleInterfaceShoaib;

public class ShoaibCarInterfaceImpl implements VehicleInterfaceShoaib, HeavyVehicleInterfaceJava {
    @Override
    public boolean hasAirBag() {
        return true;
    }

    @Override
    public int kilometerDone() {
        return 40000;
    }

    @Override
    public int numberOfWheels() {
        return 4;
    }

    @Override
    public String vehicleBrand() {
        return "Audi";
    }

    @Override
    public boolean hasAc() {
        return true;
    }

    @Override
    public boolean isPublicTransport() {
        return false;
    }
}
