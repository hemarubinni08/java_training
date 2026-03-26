package com.ust;

public abstract class VehicleAbstractMamtha {
    abstract int numberOfWheels();

    abstract String getColor();

    abstract String getFuelType();

    boolean hasEngine() {
        return true;
    }

}
