package com.ust.impl;

import com.ust.VehicleAbstractFijul;

public class TruckAbstractFijulImpl extends VehicleAbstractFijul {
    @Override
    public int getTopSpeed() {
        return 90;
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
        return 200000;
    }
}
