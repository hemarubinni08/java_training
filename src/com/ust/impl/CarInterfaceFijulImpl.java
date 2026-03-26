package com.ust.impl;

import com.ust.HeavyVehicleInterfaceFijul;
import com.ust.VehicleInterfaceFijul;

public class CarInterfaceFijulImpl implements VehicleInterfaceFijul, HeavyVehicleInterfaceFijul {
    @Override
    public int getTopSpeed() {
        return 180;
    }

    @Override
    public String brandName() {
        return "Buggatti";
    }

    @Override
    public boolean isServiceDue() {
        return false;
    }

    @Override
    public int totalKilometer() {
        return 120000;
    }

    @Override
    public boolean hasAc() {
        return true;
    }

    @Override
    public boolean isPublicTransport() {
        return false;
    }

    @Override
    public boolean hasSunroof() {
        return true;
    }
}