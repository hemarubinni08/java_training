package com.ust.impl;

import com.ust.VehicleInterfaceHarsha;

public class BikeHarshaImpl implements VehicleInterfaceHarsha {
    @Override
    public int numberOfWheels() {
        return 2;
    }

    @Override
    public int engineCapacity() {
        return 200;
    }

    @Override
    public String fuelType() {
        return "Petrol";
    }

    public boolean canDoWheelie(){
        return true;
    }
}
