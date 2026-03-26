package com.ust.impl;

import com.ust.HeavyVehiclesAbstractDeepa;
import com.ust.VehicleAbstractDeepa;

public class AutoAbstractDeepa extends HeavyVehiclesAbstractDeepa {
    @Override
    public int numberOfWheels() {
        return 3;
    }

    @Override
    public String vehicleColour() {
        return "Yellow";
    }

    @Override
    public String vehicleBrand() {
        return "Bajaj";
    }

    public boolean hasGears() {
        return true;
    }

    public boolean hasEngine() {
        return true;
    }

    public boolean hasAc() {
        return false;
    }

    public boolean isPublicTransport() {
        return true;
    }

    public boolean hasSunroof() {
        return false;
    }
}
