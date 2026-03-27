package com.ust;

public class CarAbstractDeepshika extends VehicleAbstractDeepshika{
    @Override
    int noOFWheels() {
        return 4;
    }

    @Override
    String color() {
        return "Black";
    }

    @Override
    String typeOfFuel() {
        return "Petrol";
    }
}
