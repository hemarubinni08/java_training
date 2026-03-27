package com.ust;

public class HeavyVehiclesAbstractDeepa extends VehicleAbstractDeepa {
    @Override
    public int numberOfWheels() {
        return 0;
    }

    @Override
    public String vehicleColour() {
        return "";
    }

    @Override
    public String vehicleBrand() {
        return "";
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
