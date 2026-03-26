package com.ust.impl;

import com.ust.HeavyVehicleInterfaceVarsha;
import com.ust.VehicleInterfaceVarsha;

public class BikeVarshaImpl implements VehicleInterfaceVarsha, HeavyVehicleInterfaceVarsha {
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
    public int numberOfDoors() {
        return 0;
    }

    @Override
    public boolean publicTransportation() {
        return false;
    }

    @Override
    public boolean hasAc() {
        return false;
    }

    @Override
    public boolean sunRoof() {
        return false;
    }
}
