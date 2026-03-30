package com.ust;

public class TruckAbstractHema extends VehicleAbstractHema {

    @Override
    public String getBrand() {
        return "Mahendra";
    }

    @Override
    protected int getWheelsCount() {
        return 10;
    }

    @Override
    protected String getFuelType() {
        return "Diesel";
    }

    public int loadCapacity() {
        return 30000;
    }
}
