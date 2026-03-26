package com.ust.impl;

import com.ust.VehicleInterfaceDeepak;

public class BikeInterfaceDeepakImpl implements VehicleInterfaceDeepak {
    @Override
    public int wheels() {
        return 2;
    }

    @Override
    public int noofseats() {
        return 2;
    }

    @Override
    public String brand() {
        return "yamaha";
    }
}
