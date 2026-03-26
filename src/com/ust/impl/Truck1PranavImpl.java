package com.ust.impl;

import com.ust.HeavyVehicleInterfacePranav;
import com.ust.VehicleInterfacePranav;

public class Truck1PranavImpl implements HeavyVehicleInterfacePranav {
    @Override
    public int numberOfWheels() {
        return 12;
    }

    @Override
    public String engineCapacity() {
        return "3000cc";
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
        return false;
    }

    @Override
    public boolean hasSunRoof() {
        return false;
    }
}
