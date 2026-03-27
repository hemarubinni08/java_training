package com.ust.impl;

import com.ust.VehicleInterfaceDeepshika;

public class BusInterfaceDeepshika implements VehicleInterfaceDeepshika {
    @Override
    public int noOfWheels() {
        return 8;
    }

    @Override
    public String color() {
        return "Blue";
    }

    @Override
    public String typeOfFuel() {
        return "Electric";
    }
}
