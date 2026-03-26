package com.ust;

public class TruckPranav extends HeavyVehicle {
    @Override
    public int numberOfWheels() {
        return 12;
    }

    @Override
    public String fuelType() {
        return "diesel";
    }

    @Override
    public String engineCapacity() {
        return "3000cc";
    }

    @Override
    public boolean publicTransport() {
        return true;
    }

    @Override
    public boolean hasSunRoof() {
        return false;
    }

    @Override
    public boolean isHeavy() {
        return true;
    }
}
