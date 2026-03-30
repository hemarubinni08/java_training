package com.ust;

public class ArdraBikeAbstract extends ArdraVehicleAbstract{
    @Override
    int numberOfWheels() {
        return 2;
    }

    @Override
    String sizeOfVehicle() {
        return "Small";
    }

    @Override
    int numberOfPassengers() {
        return 2;
    }
}
