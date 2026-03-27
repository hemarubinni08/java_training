package com.ust;

public class BusAbstractMamtha extends VehicleAbstractMamtha {
    @Override
    int numberOfWheels() {
        return 8;
    }

    @Override
    String getColor() {
        return "Yellow";
    }

    @Override
    String getFuelType() {
        return "Desile";
    }
}
