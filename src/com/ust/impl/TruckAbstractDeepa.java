package com.ust.impl;

import com.ust.HeavyVehiclesAbstractDeepa;
import com.ust.VehicleAbstractDeepa;

public class TruckAbstractDeepa extends HeavyVehiclesAbstractDeepa {
    @Override
    public int numberOfWheels() {
        return 4;
    }

    @Override
    public String vehicleColour() {
        return "Black";
    }

    @Override
    public String vehicleBrand() {
        return "Mahindra";
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
        return false;
    }

    public boolean hasSunroof() {
        return false;
    }
}
