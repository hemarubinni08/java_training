package com.ust.impl;

import com.ust.VehicleInferfaceNavya;

public class BusInterfaceNavyaImpl implements VehicleInferfaceNavya,HeavyVehicleInterfaceNavya{

    @Override
    public int wheels() {
        return 8;
    }

    @Override
    public int numbersOfSeats() {
        return 40;
    }

    @Override
    public String brandOfVehicle() {
        return "volvo";
    }

    @Override
    public boolean hasAc() {
        return true;
    }

    @Override
    public int noOfPassengers() {
        return 40;
    }
}
