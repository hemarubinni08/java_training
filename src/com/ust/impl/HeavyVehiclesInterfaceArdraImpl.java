package com.ust.impl;

import com.ust.HeavyVehiclesInterfaceArdra;

public class HeavyVehiclesInterfaceArdraImpl implements HeavyVehiclesInterfaceArdra {
    @Override
    public int numberOfDoors() {
        return 4;
    }

    @Override
    public String getSizeOfVehicle() {
        return "Large";
    }

    @Override
    public int numberOfWheels() {
        return 6;
    }
}