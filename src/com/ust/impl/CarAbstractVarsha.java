package com.ust.impl;

import com.ust.HeavyVehicleAbstractVarsha;
import com.ust.VehicleAbstractVarsha;

public class CarAbstractVarsha extends HeavyVehicleAbstractVarsha {
    @Override
    public int numberOfWheels() {
        return 4;
    }

    @Override
    public int numberOfLights() {
        return 4;
    }

    @Override
    public int capacityOfFuel() {
        return 500;
    }

    @Override
    public boolean hasEngine() {
        return true;
    }

    @Override
    public boolean hasGears() {
        return true;
    }

    public int numberOfDoors() {
        return 4;
    }

    public boolean publicTransportation() {
        return true;
    }

    public boolean hasAc() {
        return true;
    }

    public boolean sunRoof() {
        return true;
    }
}
