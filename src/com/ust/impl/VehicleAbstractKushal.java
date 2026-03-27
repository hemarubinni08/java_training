package com.ust.impl;

// The Abstract Class and the Child Classes Has Default Private Methods, So to use it outside the Class We have to explicitely make them public.

public abstract class VehicleAbstractKushal {
    public abstract int getWheelsCount();

    public abstract String getColour();

    public abstract String getBrand();

    public abstract String getVehicleType();

    public boolean hasWindows() {
        return true;
    }

    public boolean hasGears() {
        return true;
    }
}
