package com.ust.impl;

import com.ust.VehicleAbstractFijul;

public class CarAbstractFijulImpl extends VehicleAbstractFijul {
    @Override
    public int getTopSpeed() {
        return 200;
    }

    @Override
    public String brandName() {
        return "Nissan";
    }

    @Override
    public boolean isServiceDue() {
        return false;
    }

    @Override
    public int totalKilometer() {
        return 20000;
    }
}
