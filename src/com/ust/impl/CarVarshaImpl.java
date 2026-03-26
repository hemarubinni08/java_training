package com.ust.impl;

import com.ust.HeavyVehicleInterfaceVarsha;
import com.ust.VehicleInterfaceVarsha;

public class CarVarshaImpl implements VehicleInterfaceVarsha, HeavyVehicleInterfaceVarsha {
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
    public int numberOfDoors() {
        return 4;
    }

    @Override
    public boolean publicTransportation() {
        return true;
    }

    @Override
    public boolean hasAc() {
        return true;
    }

    @Override
    public boolean sunRoof() {
        return true;
    }
}
