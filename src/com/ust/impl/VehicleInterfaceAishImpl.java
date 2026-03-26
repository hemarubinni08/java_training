package com.ust.impl;

import com.ust.VehicleInterfaceAish;

public class VehicleInterfaceAishImpl implements VehicleInterfaceAish {
    @Override
    public int wheels() {
        return 4;
    }

    @Override
    public String color() {
        return "red";
    }

    @Override
    public String brand() {
        return "honda";
    }
}
