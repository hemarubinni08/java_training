package com.ust;

public class BikeAbstractMamtha extends VehicleAbstractMamtha{
    @Override
    int numberOfWheels() {
        return 2;
    }

    @Override
    String getColor() {
        return "Black";
    }

    @Override
    String getFuelType() {
        return "Petrol";
    }
}
