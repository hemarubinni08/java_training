package com.ust;

public class BikeAbstractKvImpl extends VehicleAbstractKv{
    public int noOfWheels() {
        return 2;
    }

    @Override
    public int maxSpeed() {
        return 70;
    }

    @Override
    public String getBrand() {
        return "HONDA";
    }
}
