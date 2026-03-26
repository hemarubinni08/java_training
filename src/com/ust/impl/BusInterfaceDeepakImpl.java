package com.ust.impl;

import com.ust.HeavyVehicleInterfaceDeepak;
import com.ust.VehicleInterfaceDeepak;

public class BusInterfaceDeepakImpl implements VehicleInterfaceDeepak, HeavyVehicleInterfaceDeepak {
    @Override
    public int wheels() {
        return 8;
    }

    @Override
    public int noofseats() {
        return 40;
    }

    @Override
    public String brand() {
        return "Volvo";
    }

    @Override
    public boolean hasAc() {
        return false;
    }

    @Override
    public int noOfDoors() {
        return 2;
    }
}
