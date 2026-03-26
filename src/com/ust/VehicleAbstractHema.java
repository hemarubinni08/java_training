package com.ust;

public abstract class VehicleAbstractHema {

    protected abstract String getBrand();

    protected abstract int getWheelsCount();

    protected abstract String getFuelType();

    protected int doorsCount() {
        return 2;
    }
}
