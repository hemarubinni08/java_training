package com.ust.impl;

import com.ust.VehicleInterfaceAish;

public class BikeInterfaceImpl implements VehicleInterfaceAish {

    @Override
    public int wheels() {
        return 2;
    }

    @Override
    public String color() {
        return "black";
    }

    @Override
    public String brand() {
        return "bullet";
    }
}