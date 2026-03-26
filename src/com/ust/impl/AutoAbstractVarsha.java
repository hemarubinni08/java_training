package com.ust.impl;

import com.ust.HeavyVehicleAbstractVarsha;
import com.ust.VehicleAbstractVarsha;

public class AutoAbstractVarsha extends HeavyVehicleAbstractVarsha {
    @Override
    public int numberOfWheels() {
        return 3;
    }

    @Override
    public int numberOfLights() {
        return 3;
    }

    @Override
    public int capacityOfFuel() {
        return 300;
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
        return 0;
    }

    public boolean publicTransportation() {
        return true;
    }

    public boolean hasAc() {
        return false;
    }

    public boolean sunRoof() {
        return false;
    }
}
