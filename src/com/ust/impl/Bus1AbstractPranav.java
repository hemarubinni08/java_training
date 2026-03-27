package com.ust.impl;

import com.ust.HeavyVehicleAbstractPranav;

public class Bus1AbstractPranav extends HeavyVehicleAbstractPranav {
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
    public boolean hasAc() {
        return false;
    }

    @Override
    public boolean isPublicTransport() {
        return false;
    }

    @Override
    public boolean hasSunRoof() {
        return false;
    }
}
