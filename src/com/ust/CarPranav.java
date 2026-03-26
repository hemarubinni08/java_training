package com.ust;

public class CarPranav extends VehiclePranav {
    @Override
    public int numberOfWheels() {
        return 4;
    }

    @Override
    public String fuelType() {
        return "diesel";
    }

    @Override
    public String engineCapacity() {
        return "1500cc";
    }
}
