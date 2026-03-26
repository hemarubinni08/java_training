package com.ust.impl;

import com.ust.VehicleInterfaceAnu;

public class ScootyInterfaceImpl implements VehicleInterfaceAnu {
    @Override
    public int noOfWheels() {
        return 2;
    }

    @Override
    public int maxSpeed() {
        return 50;
    }

    @Override
    public String getBrand() {
        return "Activa";
    }
}
