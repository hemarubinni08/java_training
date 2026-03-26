package com.ust;

public class CarAbstractAnu extends VehicleAbstractAnu {
    @Override
    int noOfWheels() {
        return 4;
    }

    @Override
    int maxSpeed() {
        return 100;
    }

    @Override
    String getBrand() {
        return "MG";
    }

}
