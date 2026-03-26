package com.ust.impl;

import com.ust.HeavyVehicleInterfaceAkash;
import com.ust.VehicleInterfaceAkash;

public class CarInterfaceAkashImpl implements VehicleInterfaceAkash, HeavyVehicleInterfaceAkash {
    @Override
    public int numberOfWheels() {
        return 4;
    }

    @Override
    public double applicableTax() {
        return 18.00;
    }

    @Override
    public int seatingCapacity() {
        return 5;
    }

    @Override
    public double powerGenerated() {
        return 600;
    }

    @Override
    public boolean hasAC() {
        return true;
    }

    @Override
    public boolean isCommercial() {
        return false;
    }

    @Override
    public boolean isMultiAxle() {
        return false;
    }

    public int numberOfDoors() {
        return 2;
    }
}
