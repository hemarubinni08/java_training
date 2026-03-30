package com.ust.impl;

import com.ust.HeavyVehicleInterfaceJava;
import com.ust.VehicleInterfaceShoaib;

public class ShoaibBusInterfaceImpl implements VehicleInterfaceShoaib, HeavyVehicleInterfaceJava{
    public int numberOfWheels() {
        System.out.println("Bus wheels");
        return 4;
    }

    public String vehicleBrand() {
        return "Tata";
    }

    @Override
    public boolean hasAirBag() {
        return false;
    }

    @Override
    public boolean hasAc() {
        return false;
    }

    @Override
    public boolean isPublicTransport() {
        return true;
    }

    @Override
    public int kilometerDone() {
        return 50000;
    }
}
