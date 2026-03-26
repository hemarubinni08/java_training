package com.ust.impl;

import com.ust.HeavyVehicleInterfaceFijul;
import com.ust.VehicleInterfaceFijul;

public class TruckInterfaceFijulImpl implements VehicleInterfaceFijul, HeavyVehicleInterfaceFijul {
    @Override
    public boolean hasAc() {
        return false;
    }

    @Override
    public boolean isPublicTransport() {
        return false;
    }

    @Override
    public boolean hasSunroof() {
        return false;
    }

    @Override
    public int getTopSpeed() {
        return 100;
    }

    @Override
    public String brandName() {
        return "Volvo";
    }

    @Override
    public boolean isServiceDue() {
        return true;
    }

    @Override
    public int totalKilometer() {
        return 150000;
    }
}