package com.ust.impl;

import com.ust.VehicleAbstractDeepa;

public class BikeAbstractDeepa extends VehicleAbstractDeepa {
    @Override
    public int numberOfWheels() {
        return 2;
    }

    @Override
    public String vehicleColour() {
        return "Black";
    }

    @Override
    public String vehicleBrand() {
        return "Enfield";
    }

    public boolean hasGears() {
        return true;
    }

    public boolean hasEngine() {
        return true;
    }
}
