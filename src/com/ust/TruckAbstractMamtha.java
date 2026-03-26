package com.ust;

public class TruckAbstractMamtha extends VehicleAbstractMamtha {
    @Override
    int numberOfWheels() {
        return 10;
    }

    @Override
    String getColor() {
        return "Brown";
    }

    @Override
    String getFuelType() {
        return "Desile";
    }
}
