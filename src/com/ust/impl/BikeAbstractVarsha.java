package com.ust.impl;

import com.ust.HeavyVehicleAbstractVarsha;
import com.ust.VehicleAbstractVarsha;

public class BikeAbstractVarsha extends VehicleAbstractVarsha {
    @Override
    public int numberOfWheels() {
        return 2;
    }

    @Override
    public int numberOfLights() {
        return 2;
    }

    @Override
    public int capacityOfFuel() {
        return 100;
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
        return false;
    }

    public boolean hasAc() {
        return false;
    }

    public boolean sunRoof() {
        return false;
    }
}