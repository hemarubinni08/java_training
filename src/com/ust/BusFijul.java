package com.ust;

public class BusFijul extends HeavyVehicleFijul {
    @Override
    public int numberOfWheels() {
        return 6;
    }

    @Override
    public int totalKilometer() {
        return 210000;
    }
}
