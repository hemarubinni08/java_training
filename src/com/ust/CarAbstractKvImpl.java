package com.ust;

public class CarAbstractKvImpl extends HeavyVehicleAbstractKv {
    public int noOfWheels() {
        return 4;
    }

    @Override
    public int maxSpeed() {
        return 200;
    }

    @Override
    public String getBrand() {
        return "Activa";
    }

    @Override
    boolean hasAc() {
        return false;
    }
}
