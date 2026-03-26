package com.ust.impl;

import com.ust.HeavyVehicleInterfaceFijul;
import com.ust.VehicleInterfaceFijul;

public class BusInterfaceFijulImpl implements VehicleInterfaceFijul, HeavyVehicleInterfaceFijul {
    @Override
    public int getTopSpeed() {
        return 120;
    }

    @Override
    public String brandName() {
        return "TATA";
    }

    @Override
    public boolean isServiceDue() {
        return false;
    }

    @Override
    public int totalKilometer() {
        return 100000;
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
    public boolean hasSunroof() {
        return false;
    }
}