package com.ust;

public class BikeAbstractDeepshika extends VehicleAbstractDeepshika{
    @Override
    int noOFWheels() {
        return 2;
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
