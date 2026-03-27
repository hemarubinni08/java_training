package com.ust;

public class CarAbstractDeepak extends VehicleAbstractDeepak {
    @Override
    int wheels() {
        return 4;
    }

    @Override
    int noofseats() {
        return 2;
    }

    @Override
    String brand() {
        return "Porsche";
    }
}
