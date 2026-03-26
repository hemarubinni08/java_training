package com.ust.impl;

import com.ust.HeavyVehicleDeepak;
import com.ust.HeavyVehicleInterfaceDeepak;
import com.ust.VehicleInterfaceDeepak;

public class TruckInterfaceDeepakImpl implements VehicleInterfaceDeepak, HeavyVehicleInterfaceDeepak {
    @Override
    public int wheels() {
        return 6;
    }

    @Override
    public int noofseats() {
        return 2;
    }

    @Override
    public String brand() {
        return "Mahendra";
    }

    @Override
    public boolean hasAc() {
        return true;
    }

    @Override
    public int noOfDoors() {
        return 2;
    }
}
