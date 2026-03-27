package com.ust.impl;

import com.ust.VehicleInferfaceNavya;

public class TruckInterfaceNavyaImpl implements VehicleInferfaceNavya, HeavyVehicleInterfaceNavya {

    @Override
    public int wheels() {
        return 6;
    }

    @Override
    public int numbersOfSeats() {
        return 2;
    }

    @Override
    public String brandOfVehicle() {
        return "mahendra";
    }

    @Override
    public boolean hasAc() {
        return false;
    }

    @Override
    public int noOfPassengers() {
        return 6;
    }
}
