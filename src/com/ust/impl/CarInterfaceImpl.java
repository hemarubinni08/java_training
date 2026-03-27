package com.ust.impl;

import com.ust.VehicleInterfaceHarsh;

public class CarInterfaceImpl implements VehicleInterfaceHarsh {
    @Override
    public int wheeles() {
        return 4;
    }

    @Override
    public String color() {
        return "Black";
    }

    @Override
    public String brand() {
        return "BMW";
    }
}
