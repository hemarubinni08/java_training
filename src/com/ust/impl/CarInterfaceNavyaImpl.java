package com.ust.impl;

import com.ust.VehicleInferfaceNavya;

public class CarInterfaceNavyaImpl implements VehicleInferfaceNavya,HeavyVehicleInterfaceNavya {
    @Override
    public int wheels() {
        return 4;
    }

    @Override
    public int numbersOfSeats() {
        return 4;
    }

    @Override
    public String brandOfVehicle() {
        return "honda";
    }

    @Override
    public boolean hasAc() {
        return true;
    }

    @Override
    public int noOfPassengers() {
        return 6;
    }
}
