package com.ust;

public class HeavyVehicleAbstractNavya extends VehicleAbstractNavya {
    @Override
    int wheels() {
        return 0;
    }

    @Override
    int numbersOfSeats() {
        return 0;
    }

    @Override
    String brandOfVehicle() {
        return "";
    }

    boolean hasAc() {
        return true;
    }

}
