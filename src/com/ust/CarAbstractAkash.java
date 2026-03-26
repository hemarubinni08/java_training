package com.ust;

public class CarAbstractAkash extends HeavyVehicleAbstractAkash {

    @Override
    int numberOfWheels() {
        return 4;
    }

    @Override
    double applicableTax() {
        return 18.00;
    }

    @Override
    int seatingCapacity() {
        return 4;
    }

    @Override
    double powerGenerated() {
        return 600;
    }

    @Override
    boolean hasAC() {
        return true;
    }

    @Override
    boolean isCommercial() {
        return false;
    }

    @Override
    boolean isMultiAxle() {
        return false;
    }
}
