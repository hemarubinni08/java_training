package com.ust;

public class TruckAbstractDeepshika extends VehicleAbstractDeepshika{
    @Override
    int noOFWheels() {
        return 6;
    }

    @Override
    String color() {
        return "Brown";
    }

    @Override
    String typeOfFuel() {
        return "Diesel";
    }
}
