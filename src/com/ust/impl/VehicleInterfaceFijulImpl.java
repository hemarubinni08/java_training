package com.ust.impl;

import com.ust.VehicleInterfaceFijul;

public class VehicleInterfaceFijulImpl implements VehicleInterfaceFijul {
    @Override
    public int getTopSpeed() {
        return 0;
    }

    @Override
    public String brandName() {
        return "";
    }

    @Override
    public boolean isServiceDue() {
        return false;
    }

    @Override
    public int totalKilometer() {
        return 0;
    }
}