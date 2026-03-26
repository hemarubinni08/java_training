package com.ust.impl;

import com.ust.HeavyVehicleAbstractVarsha;
import com.ust.VehicleAbstractVarsha;

public class BusAbstractVarsha extends HeavyVehicleAbstractVarsha {
    @Override
    public int numberOfWheels() {
        return 6;
    }

    @Override
    public int numberOfLights() {
        return 4;
    }

    @Override
    public int capacityOfFuel() {
        return 1000;
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
        return 2;
    }

    public boolean publicTransportation() {
        return true;
    }

    public boolean hasAc() {
        return true;
    }

    public boolean sunRoof() {
        return false;
    }
}
