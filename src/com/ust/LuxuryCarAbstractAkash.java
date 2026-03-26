package com.ust;

public class LuxuryCarAbstractAkash extends HeavyVehicleAbstractAkash {
    @Override
    int numberOfWheels() {
        return 4;
    }

    @Override
    double applicableTax() {
        return 25;
    }

    @Override
    int seatingCapacity() {
        return 4;
    }

    @Override
    double powerGenerated() {
        return 2500;
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
