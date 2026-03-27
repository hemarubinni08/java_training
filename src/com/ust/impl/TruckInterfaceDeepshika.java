package com.ust.impl;

import com.ust.VehicleInterfaceDeepshika;

public class TruckInterfaceDeepshika implements VehicleInterfaceDeepshika {
    @Override
    public int noOfWheels() {
        return 6;
    }

    @Override
    public String color() {
        return "Brown";
    }

    @Override
    public String typeOfFuel() {
        return "Diesel";
    }
}
