package com.ust;

public class BikeAbstractAnu extends VehicleAbstractAnu{
    @Override
    int noOfWheels() {
        return 2;
    }

    @Override
    int maxSpeed() {
        return 120;
    }

    @Override
    String getBrand() {
        return "Royal Enfield";
    }
}
