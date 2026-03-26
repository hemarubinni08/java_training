package com.ust;

public class BusPranav extends HeavyVehicle {
    @Override
    public int numberOfWheels() {
        return 6;
    }

    @Override
    public String fuelType() {
        return "diesel";
    }

    @Override
    public String engineCapacity() {
        return "800cc";
    }

    @Override
    public boolean hasSunRoof() {
        return super.hasSunRoof();
    }

    @Override
    public boolean isHeavy() {
        return true;
    }

    @Override
    public boolean publicTransport() {
        return true;
    }
}
