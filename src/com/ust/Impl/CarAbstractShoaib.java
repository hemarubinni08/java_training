package com.ust.Impl;

import com.ust.VehicleAbstractShoaib;

public  class CarAbstractShoaib extends VehicleAbstractShoaib {
    public boolean hasAirBag() {
        return true;
    }


    public int kilometerDone() {
        return 40000;
    }

    @Override
    public int numberOfWheels() {
        return 4;
    }

    @Override
    public String vehicleBrand() {
        return "Audi";
    }


    public boolean isPublicTransport() {
        return true;
    }
}
