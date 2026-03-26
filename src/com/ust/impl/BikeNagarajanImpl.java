package com.ust.impl;

import com.ust.VehicleInterfaceNagarajan;

public class BikeNagarajanImpl implements VehicleInterfaceNagarajan {
    public String brand;
    public int speed;
    public boolean helmet;

    @Override
    public String start() {
        return brand + " is  Starting";
    }

    @Override
    public String stop() {
        return brand + " is stopped";
    }

    @Override
    public String displayInfo() {
        return "Brand : " + brand + ", Speed : " + speed;
    }

    public String ride() {
        return "Bike is ridining";
    }
}

