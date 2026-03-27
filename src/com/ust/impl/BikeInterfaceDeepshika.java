package com.ust.impl;

import com.ust.VehicleInterfaceDeepshika;

public class BikeInterfaceDeepshika implements VehicleInterfaceDeepshika {
    @Override
    public int noOfWheels() {
        return 2;
    }

    @Override
    public String color() {
        return "Black";
    }

    @Override
    public String typeOfFuel() {
        return "Petrol";
    }
}
