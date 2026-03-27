package com.ust.impl;

import com.ust.VehicleInterfaceDeepshika;

public class CarInterfaceDeepshika implements VehicleInterfaceDeepshika {
    @Override
    public int noOfWheels() {
        return 4;
    }

    @Override
    public String color() {
        return "Blue";
    }

    @Override
    public String typeOfFuel() {
        return "Diesel";
    }
}
