package com.ust;

public class CarFijul extends HeavyVehicleFijul {
    public int numberOfDoors() {
        return 4;
    }

    @Override
    public boolean hasAc() {
        return true;
    }

    @Override
    public boolean hasSunroof() {
        return true;
    }

    @Override
    public int totalKilometer() {
        return 300000;
    }
}