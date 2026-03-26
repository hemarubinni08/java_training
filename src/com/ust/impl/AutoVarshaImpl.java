package com.ust.impl;

import com.ust.HeavyVehicleInterfaceVarsha;
import com.ust.VehicleInterfaceVarsha;

public class AutoVarshaImpl implements VehicleInterfaceVarsha, HeavyVehicleInterfaceVarsha {
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
    public int numberOfDoors() {
        return 0;
    }

    @Override
    public boolean publicTransportation() {
        return true;
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
