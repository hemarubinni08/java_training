package com.ust.impl;

import com.ust.HeavyVehiclesAbstractDeepa;
import com.ust.VehicleAbstractDeepa;

public class CarAbstractDeepa extends HeavyVehiclesAbstractDeepa {
    @Override
    public int numberOfWheels() {
        return 4;
    }

    @Override
    public String vehicleColour() {
        return "Red";
    }

    @Override
    public String vehicleBrand() {
        return "Ford";
    }

    public boolean hasGears() {
        return true;
    }

    public boolean hasEngine() {
        return true;
    }

    public boolean hasAc() {
        return true;
    }

    public boolean isPublicTransport() {
        return false;
    }

    public boolean hasSunroof() {
        return true;
    }
}
