package com.ust;

public abstract class VehicleAbstractAron {
    protected abstract String getSound();

    protected abstract String getBrandName();

    protected abstract int getNoOfWheels();

    protected int getWarrantyInYears() {
        return 5;
    }
}
