package com.ust.impl;

import com.ust.VehicleAbstractFijul;

public class BikeAbstractFijulimpl extends VehicleAbstractFijul {

    @Override
    protected int getTopSpeed() {
        return 200;
    }

    @Override
    protected String brandName() {
        return "KTM";
    }

    @Override
    protected boolean isServiceDue() {
        return false;
    }

    @Override
    protected int totalKilometer() {
        return 23000;
    }
}
