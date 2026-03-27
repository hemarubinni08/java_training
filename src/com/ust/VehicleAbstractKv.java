package com.ust;

public abstract class VehicleAbstractKv {
    abstract int noOfWheels();

    abstract int maxSpeed();

    abstract String getBrand();

     boolean hasAc() {
        return true;
    }
}


