package com.ust.impl;

import com.ust.HeavyVehicleInterfacePranav;
import com.ust.VehicleInterfacePranav;

public class Bus1PranavImpl implements HeavyVehicleInterfacePranav {
    @Override
    public int numberOfWheels() {
        return 8;
    }

    @Override
    public String engineCapacity() {
        return "800cc";
    }

    @Override
    public String fuelType() {
        return "Diesel";
    }

    @Override
    public boolean isHeavy() {
        return true;
    }

    @Override
    public boolean publicTransport() {
        return true;
    }

    @Override
    public boolean hasSunRoof() {
        return false;
    }
}
