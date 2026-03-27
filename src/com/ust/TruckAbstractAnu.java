package com.ust;

public class TruckAbstractAnu extends VehicleAbstractAnu{
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
        return "TATA";
    }
}
