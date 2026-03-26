package com.ust.impl;

import com.ust.HeavyVehicleInterfaceAkash;
import com.ust.VehicleInterfaceAkash;

public class TruckInterfaceAkashImpl implements VehicleInterfaceAkash, HeavyVehicleInterfaceAkash {
    @Override
    public int numberOfWheels() {
        return 10;
    }

    @Override
    public double applicableTax() {
        return 25.00;
    }

    @Override
    public int seatingCapacity() {
        return 3;
    }

    @Override
    public double powerGenerated() {
        return 1200;
    }

    @Override
    public boolean hasAC() {
        return false;
    }

    @Override
    public boolean isCommercial() {
        return true;
    }

    @Override
    public boolean isMultiAxle() {
        return true;
    }

    public int numberOfDoors() {
        return 2;
    }
}
