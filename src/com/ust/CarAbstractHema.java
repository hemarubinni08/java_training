package com.ust;

public class CarAbstractHema extends VehicleAbstractHema {

    @Override
    public String getBrand() {
        return "BMW";
    }

    @Override
    public int getWheelsCount() {
        return 4;
    }

    @Override
    protected String getFuelType() {
        return "Diesel";
    }

    int Capacity() {
        return 20000;
    }

    public String color() {
        return "violet";
    }
}
