package com.ust;

public class BikeAbstractAkash extends HeavyVehicleAbstractAkash {
    @Override
    int numberOfWheels() {
        return 2;
    }

    @Override
    double applicableTax() {
        return 12.00;
    }

    @Override
    int seatingCapacity() {
        return 2;
    }

    @Override
    double powerGenerated() {
        return 350;
    }

    @Override
    boolean hasAC() {
        return false;
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
