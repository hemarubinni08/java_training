package com.ust.impl;

import com.ust.VehicleInterfaceDeepak;

public class VehicleInterfaceDeepakImpl implements VehicleInterfaceDeepak {
    @Override
    public int wheels() {
        return 4;
    }

    @Override
    public int noofseats() {
        return 4;
    }

    @Override
    public String brand() {
        return "Volvo";
    }
}

