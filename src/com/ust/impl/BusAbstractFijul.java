package com.ust.impl;

import com.ust.VehicleAbstractFijul;

public class BusAbstractFijul extends VehicleAbstractFijul {
    @Override
    public int getTopSpeed() {
        return 110;
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
        return 134500;
    }
}
