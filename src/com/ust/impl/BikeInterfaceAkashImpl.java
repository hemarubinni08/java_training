package com.ust.impl;

import com.ust.VehicleInterfaceAkash;

public class BikeInterfaceAkashImpl implements VehicleInterfaceAkash {
    @Override
    public int numberOfWheels() {
        return 2;
    }

    @Override
    public double applicableTax() {
        return 12.00;
    }

    @Override
    public int seatingCapacity() {
        return 2;
    }

    @Override
    public double powerGenerated() {
        return 350;
    }
}
