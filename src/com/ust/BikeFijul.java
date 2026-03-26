package com.ust;

public class BikeFijul extends VehicleFijul {
    @Override
    public int numberOfWheels() {
        return 2;
    }

    @Override
    public String brandName() {
        return "KTM";
    }
}