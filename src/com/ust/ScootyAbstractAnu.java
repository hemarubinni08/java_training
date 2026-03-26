package com.ust;

public class ScootyAbstractAnu extends VehicleAbstractAnu{
    @Override
    int noOfWheels() {
        return 2;
    }

    @Override
    int maxSpeed() {
        return 70;
    }

    @Override
    String getBrand() {
        return "Activa";
    }
}
