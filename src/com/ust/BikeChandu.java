package com.ust;

public class BikeChandu extends VehicleChandu {
    @Override
    public String fuel() {
        return "Petrol";
    }

    @Override
    public int wheels() {
        return 2;
    }

    @Override
    public int engine() {
        return 155;
    }

    @Override
    public int passenger() {
        return 2;
    }
}
