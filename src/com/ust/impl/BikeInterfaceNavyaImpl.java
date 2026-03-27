package com.ust.impl;

import com.ust.VehicleInferfaceNavya;

public class BikeInterfaceNavyaImpl implements VehicleInferfaceNavya {

    @Override
    public int wheels() {
        return 2;
    }

    @Override
    public int numbersOfSeats() {
        return 1;
    }

    @Override
    public String brandOfVehicle() {
        return "honda";
    }


}
