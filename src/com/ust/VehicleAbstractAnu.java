package com.ust;

public abstract class VehicleAbstractAnu {
    abstract int noOfWheels();

    abstract int maxSpeed();

    abstract String getBrand();

    public boolean hasGears() {
        return true;
    }

    public boolean hasEngine() {
        return true;
    }
}
