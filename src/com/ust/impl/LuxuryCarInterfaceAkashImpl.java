package com.ust.impl;

import com.ust.HeavyVehicleInterfaceAkash;
import com.ust.VehicleInterfaceAkash;

public class LuxuryCarInterfaceAkashImpl implements VehicleInterfaceAkash, HeavyVehicleInterfaceAkash {
    @Override
    public int numberOfWheels() {
        return 4;
    }

    @Override
    public double applicableTax() {
        return 30;
    }

    @Override
    public int seatingCapacity() {
        return 4;
    }

    @Override
    public double powerGenerated() {
        return 2400;
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
        return 4;
    }
}
