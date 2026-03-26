package com.ust;

public class BikeAd extends Vehicle {
    @Override
    public int noOfWheels() {
        return 2;
    }

    @Override
    public int maxSpeed() {
        return 80;
    }

    @Override
    public String getBrand() {
        return "Royal Enfield";
    }
}
