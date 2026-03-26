package com.ust;

public class HeavyVehicleAbstractVarsha extends VehicleAbstractVarsha {
    @Override
    public int numberOfWheels() {
        return 0;
    }

    @Override
    public int numberOfLights() {
        return 0;
    }

    @Override
    public int capacityOfFuel() {
        return 0;
    }

    @Override
    public boolean hasGears() {
        return false;
    }

    @Override
    public boolean hasEngine() {
        return true;
    }
}
