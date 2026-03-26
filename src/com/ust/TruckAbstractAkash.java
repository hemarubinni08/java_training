package com.ust;

public class TruckAbstractAkash extends HeavyVehicleAbstractAkash {
    @Override
    int numberOfWheels() {
        return 10;
    }

    @Override
    double applicableTax() {
        return 20;
    }

    @Override
    int seatingCapacity() {
        return 3;
    }

    @Override
    double powerGenerated() {
        return 1200;
    }

    @Override
    boolean hasAC() {
        return false;
    }

    @Override
    boolean isCommercial() {
        return true;
    }

    @Override
    boolean isMultiAxle() {
        return true;
    }
}
