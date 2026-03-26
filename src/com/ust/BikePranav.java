package com.ust;

public class BikePranav extends VehiclePranav {
    @Override
    public int numberOfWheels() {
        return 2;
    }

    @Override
    public String fuelType() {
        return "Petrol";
    }

    @Override
    public String engineCapacity() {
        return "350cc";
    }

    public String twoSeater() {
        return "yes its two seater";
    }
}
