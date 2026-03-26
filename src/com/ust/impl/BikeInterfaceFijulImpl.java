package com.ust.impl;

import com.ust.VehicleInterfaceFijul;

public class BikeInterfaceFijulImpl implements VehicleInterfaceFijul {
    @Override
    public int getTopSpeed() {
        return 200;
    }

    @Override
    public String brandName() {
        return "KTM";
    }

    @Override
    public boolean isServiceDue() {
        return false;
    }

    @Override
    public int totalKilometer() {
        return 60000;
    }
}