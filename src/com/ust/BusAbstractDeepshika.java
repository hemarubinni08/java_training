package com.ust;

public class BusAbstractDeepshika extends VehicleAbstractDeepshika{
    @Override
    int noOFWheels() {
        return 8;
    }

    @Override
    String color() {
        return "Blue";
    }

    @Override
    String typeOfFuel() {
        return "Diesel";
    }
}
