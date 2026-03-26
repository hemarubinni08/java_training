package com.ust.impl;

import com.ust.HeavyVehicleInterfaceDeepak;
import com.ust.VehicleInterfaceDeepak;

public class CarInterfaceDeepakImpl implements VehicleInterfaceDeepak, HeavyVehicleInterfaceDeepak {
    @Override
    public int wheels() {
        return 4;
    }

    @Override
    public int noofseats() {
        return 2;
    }

    @Override
    public String brand() {
        return "porsche";
    }

    @Override
    public boolean hasAc() {
        return true;
    }

    @Override
    public int noOfDoors() {
        return 4;
    }
}
