package com.ust.impl;

import com.ust.VehicleInterfaceHarsh;

public class BikeHarshImpl implements VehicleInterfaceHarsh {
    @Override
    public int wheeles() {
        return 2;
    }

    @Override
    public String color() {
        return "Black And Red";
    }

    @Override
    public String brand() {
        return "Classic 350";
    }
    public int numberOfDoor() {
        return 2;
    }
}
